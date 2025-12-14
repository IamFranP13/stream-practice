package tools;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

/**
 * Tool to hide/show solutions in Java Stream exercises.
 * 
 * Usage:
 * mvn compile exec:java -Dexec.args="hide"
 * mvn compile exec:java -Dexec.args="show"
 */
public class SolutionManager {

    private static final String EXERCISES_PATH = "src/main/java/exercises";
    private static final String BACKUP_FILE = ".solutions.dat";
    private static final String SOLUTION_START = "// SOLUTION START";
    private static final Pattern SOLUTION_PATTERN = Pattern.compile(
            "(// SOLUTION START\\r?\\n)(.*?)(\\r?\\n\\s*// SOLUTION END)",
            Pattern.DOTALL);

    public static void main(String[] args) {
        if (args.length != 1 || (!args[0].equals("hide") && !args[0].equals("show"))) {
            System.out.println("Usage: SolutionManager <hide|show>");
            System.out.println("  hide - Hides solutions for practice mode");
            System.out.println("  show - Restores solutions from backup");
            System.exit(1);
        }

        try {
            if (args[0].equals("hide")) {
                hideSolutions();
            } else {
                showSolutions();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }

    private static void hideSolutions() throws IOException {
        Path exercisesDir = Path.of(EXERCISES_PATH);
        if (!Files.exists(exercisesDir)) {
            throw new IOException("Exercises directory not found: " + EXERCISES_PATH);
        }

        Map<String, String> solutionsBackup = new HashMap<>();
        int filesProcessed = 0;

        List<Path> javaFiles = Files.walk(exercisesDir)
                .filter(p -> p.toString().endsWith(".java"))
                .filter(p -> !p.toString().contains("tools"))
                .collect(Collectors.toList());

        for (Path file : javaFiles) {
            String content = Files.readString(file);

            if (!content.contains(SOLUTION_START)) {
                continue;
            }

            Matcher matcher = SOLUTION_PATTERN.matcher(content);
            StringBuffer newContent = new StringBuffer();
            List<String> solutions = new ArrayList<>();

            while (matcher.find()) {
                String solution = matcher.group(2);
                solutions.add(solution);

                String indent = getIndentation(solution);
                // Build replacement using captured groups
                String replacement = matcher.group(1) + indent +
                        "throw new UnsupportedOperationException(\"Implement this method\");" +
                        matcher.group(3);
                matcher.appendReplacement(newContent, Matcher.quoteReplacement(replacement));
            }
            matcher.appendTail(newContent);

            if (!solutions.isEmpty()) {
                String relativePath = exercisesDir.relativize(file).toString();
                solutionsBackup.put(relativePath, String.join("\n<<<SOLUTION_SEPARATOR>>>\n", solutions));
                Files.writeString(file, newContent.toString());
                filesProcessed++;
                System.out.println("[OK] Solution hidden: " + relativePath);
            }
        }

        if (filesProcessed == 0) {
            System.out.println("[WARN] No solutions found to hide.");
            System.out.println("  Make sure files have markers:");
            System.out.println("  // SOLUTION START");
            System.out.println("  // SOLUTION END");
            return;
        }

        saveBackup(solutionsBackup);
        System.out.println("\n[SUCCESS] " + filesProcessed + " file(s) processed");
        System.out.println("[FILE] Backup saved to: " + BACKUP_FILE);
        System.out.println(
                "\n[PRACTICE] Practice mode activated! Tests will fail until you implement solutions.");
    }

    private static void showSolutions() throws IOException {
        Path backupPath = Path.of(BACKUP_FILE);
        if (!Files.exists(backupPath)) {
            throw new IOException("Backup file not found: " + BACKUP_FILE +
                    "\n  Run 'hide' first to create backup.");
        }

        Map<String, String> solutionsBackup = loadBackup();
        Path exercisesDir = Path.of(EXERCISES_PATH);
        int filesRestored = 0;

        for (Map.Entry<String, String> entry : solutionsBackup.entrySet()) {
            Path file = exercisesDir.resolve(entry.getKey());
            if (!Files.exists(file)) {
                System.out.println("[WARN] File not found: " + entry.getKey());
                continue;
            }

            String content = Files.readString(file);
            String[] solutions = entry.getValue().split("\n<<<SOLUTION_SEPARATOR>>>\n");

            Matcher matcher = SOLUTION_PATTERN.matcher(content);
            StringBuffer newContent = new StringBuffer();
            int solutionIndex = 0;

            while (matcher.find() && solutionIndex < solutions.length) {
                // Build replacement using captured groups directly
                String replacement = matcher.group(1) + solutions[solutionIndex] + matcher.group(3);
                matcher.appendReplacement(newContent, Matcher.quoteReplacement(replacement));
                solutionIndex++;
            }
            matcher.appendTail(newContent);

            Files.writeString(file, newContent.toString());
            filesRestored++;
            System.out.println("[OK] Solution restored: " + entry.getKey());
        }

        System.out.println("\n[SUCCESS] " + filesRestored + " file(s) restored");
        System.out.println("\n[SOLUTIONS] Solutions visible. Run 'mvn test' to verify.");
    }

    private static String getIndentation(String code) {
        for (String line : code.split("\\r?\\n")) {
            if (!line.trim().isEmpty()) {
                int spaces = 0;
                for (char c : line.toCharArray()) {
                    if (c == ' ')
                        spaces++;
                    else if (c == '\t')
                        spaces += 4;
                    else
                        break;
                }
                return " ".repeat(spaces);
            }
        }
        return "        ";
    }

    private static void saveBackup(Map<String, String> backup) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(backup);
        }
        String encoded = Base64.getEncoder().encodeToString(baos.toByteArray());
        Files.writeString(Path.of(BACKUP_FILE), encoded);
    }

    @SuppressWarnings("unchecked")
    private static Map<String, String> loadBackup() throws IOException {
        String encoded = Files.readString(Path.of(BACKUP_FILE));
        byte[] decoded = Base64.getDecoder().decode(encoded);
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(decoded))) {
            return (Map<String, String>) ois.readObject();
        } catch (ClassNotFoundException e) {
            throw new IOException("Error reading backup: " + e.getMessage());
        }
    }
}
