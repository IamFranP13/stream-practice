package exercises.hard;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Group numbers by their digit sum
 * Hard difficulty: requires custom grouping logic with complex key extraction
 */
public class GroupByDigitSum {

    /**
     * Groups numbers by the sum of their digits
     * For example: 123 -> 1+2+3 = 6, so it goes in group 6
     * 
     * @param numbers list of positive integers
     * @return map where key is digit sum and value is list of numbers with that
     *         digit sum
     */
    public static Map<Integer, List<Integer>> groupByDigitSum(List<Integer> numbers) {
        // SOLUTION START
        throw new UnsupportedOperationException("Implementa este método");
        // SOLUTION END
    }

    // Método auxiliar sugerido (puedes implementarlo)
    private static int digitSum(int number) {
        return String.valueOf(number)
                .chars()
                .map(c -> c - '0')
                .sum();
    }
}
