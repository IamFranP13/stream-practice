package exercises.easy;

import java.util.List;

/**
 * Check if all numbers are positive
 */
public class AllPositive {

    /**
     * Checks if all numbers in the list are positive
     * 
     * @param numbers list of integers
     * @return true if all numbers are positive, false otherwise
     */
    public static boolean areAllPositive(List<Integer> numbers) {
        return numbers.stream()
                .allMatch(n -> n > 0);
    }
}
