package exercises.easy;

import java.util.List;
import java.util.OptionalDouble;

/**
 * Calculate the average of numbers in a list
 */
public class AverageOfNumbers {

    public static OptionalDouble average(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).average();
    }
}
