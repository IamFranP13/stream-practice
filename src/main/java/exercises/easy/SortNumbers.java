package exercises.easy;

import java.util.List;

/**
 * Sort numbers in ascending order
 */
public class SortNumbers {

    /**
     * Sorts numbers in ascending order
     * 
     * @param numbers list of integers
     * @return sorted list
     */
    public static List<Integer> sort(List<Integer> numbers) {
        return numbers.stream()
                .sorted().toList();
    }
}
