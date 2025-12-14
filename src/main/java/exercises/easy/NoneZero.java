package exercises.easy;

import java.util.List;

/**
 * Check if none of the numbers are zero
 */
public class NoneZero {

    /**
     * Checks if none of the numbers in the list are zero
     * 
     * @param numbers list of integers
     * @return true if no number is zero, false otherwise
     */
    public static boolean noneAreZero(List<Integer> numbers) {
        // Pista: usa noneMatch()
        return numbers.stream().noneMatch(integer -> integer == 0);
    }
}
