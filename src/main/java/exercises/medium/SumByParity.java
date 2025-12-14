package exercises.medium;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Sum numbers grouped by even/odd
 * Medium difficulty: requires partitioning and summing
 */
public class SumByParity {

    /**
     * Sums numbers separately for even (true) and odd (false) numbers
     * 
     * @param numbers list of integers
     * @return map with true key for sum of evens, false key for sum of odds
     */
    public static Map<Boolean, Integer> sumByParity(List<Integer> numbers) {
        // TODO: Implementa este método usando streams
        // Pista: usa Collectors.partitioningBy() con Collectors.summingInt()
        // SOLUTION START
        throw new UnsupportedOperationException("Implementa este método");
        // SOLUTION END
    }
}
