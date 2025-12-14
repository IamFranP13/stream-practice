package exercises.easy;

import java.util.List;

/**
 * Square all numbers in a list
 */
public class SquareNumbers {

    /**
     * Squares all numbers in the list
     * 
     * @param numbers list of integers
     * @return list of squared numbers
     */
    public static List<Integer> square(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n).toList();
    }
}
