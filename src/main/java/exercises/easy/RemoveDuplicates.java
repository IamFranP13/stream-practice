package exercises.easy;

import java.util.List;

/**
 * Remove duplicates from a list
 */
public class RemoveDuplicates {

    /**
     * Removes duplicate elements from the list
     * 
     * @param numbers list of integers
     * @return list with unique elements only
     */
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct().toList();
    }
}
