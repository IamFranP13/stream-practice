package exercises.easy;

import java.util.List;

/**
 * Check if any number in the list is negative
 */
public class AnyNegative {

    /**
     * Checks if any number in the list is negative
     * 
     * @param numbers list of integers
     * @return true if at least one number is negative, false otherwise
     */
    public static boolean hasNegative(List<Integer> numbers) {
        // Pista: usa anyMatch()
        return numbers.stream().anyMatch(n -> n < 0);
    }
}
