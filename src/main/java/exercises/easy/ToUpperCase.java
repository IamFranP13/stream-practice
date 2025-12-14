package exercises.easy;

import java.util.List;

/**
 * Convert strings to uppercase
 */
public class ToUpperCase {

    /**
     * Converts all strings in the list to uppercase
     * 
     * @param strings list of strings
     * @return list of uppercase strings
     */
    public static List<String> convertToUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase).toList();
    }
}
