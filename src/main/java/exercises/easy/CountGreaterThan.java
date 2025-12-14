package exercises.easy;

import java.util.List;

/**
 * Count numbers greater than a threshold
 */
public class CountGreaterThan {

    /**
     * Counts how many numbers are greater than the threshold
     * 
     * @param numbers   list of integers
     * @param threshold the value to compare against
     * @return count of numbers greater than threshold
     */
    public static long count(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold)
                .count();
    }
}
