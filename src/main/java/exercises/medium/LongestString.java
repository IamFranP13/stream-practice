package exercises.medium;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Find the longest string in a list
 * Medium difficulty: requires max with custom comparator
 */
public class LongestString {

    /**
     * Finds the longest string in the list
     * If multiple strings have the same max length, returns the first one
     * 
     * @param strings list of strings
     * @return Optional containing the longest string, or empty if list is empty
     */
    public static Optional<String> findLongest(List<String> strings) {
        // TODO: Implementa este método usando streams
        // Pista: usa max() con un comparador que compare por longitud
        return strings.stream().max(Comparator.comparingInt(String::length));

    }
}
