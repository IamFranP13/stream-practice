package exercises.medium;

import java.util.List;

/**
 * Filter numbers in a range and square them
 * Medium difficulty: requires chaining filter, map operations
 */
public class FilterAndTransform {

    /**
     * Filters numbers between min and max (inclusive) and returns their squares
     *
     * @param numbers list of integers
     * @param min     minimum value (inclusive)
     * @param max     maximum value (inclusive)
     * @return list of squared numbers that were in the range
     */
    public static List<Integer> filterRangeAndSquare(List<Integer> numbers, int min, int max) {
        // TODO: Implementa este método usando streams
        // Pista: usa filter() para el rango, luego map() para elevar al cuadrado
        return numbers.stream().filter(integer ->  integer >= min && integer <= max).map(e -> e * e).toList();
    }
}
