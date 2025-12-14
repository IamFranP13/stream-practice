package exercises.easy;

import java.util.List;

/**
 * Filter even numbers from a list
 */
public class FilterEvenNumbers {

    /**
     * Filters and returns only even numbers from the input list
     * 
     * @param numbers list of integers
     * @return list containing only even numbers
     */
    public static List<Integer> filterEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

    }
}
