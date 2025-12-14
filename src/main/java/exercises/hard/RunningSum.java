package exercises.hard;

import java.util.List;
import java.util.stream.IntStream;

/**
 * Calculate running sum (cumulative sum) of a list
 * Hard difficulty: requires stateful stream operations
 */
public class RunningSum {

    /**
     * Calculates the running sum of numbers
     * For example: [1, 2, 3, 4] -> [1, 3, 6, 10]
     * 
     * @param numbers list of integers
     * @return list of running sums
     */
    public static List<Integer> calculateRunningSum(List<Integer> numbers) {
        // TODO: Implementa este método usando streams
        // Pista: usa Stream.iterate() o un enfoque con índices
        // Otra opción: usa un objeto mutable para mantener el estado (no recomendado
        // pero funcional)
        // La mejor solución usa IntStream.range() con mapToObj()
        // SOLUTION START
        throw new UnsupportedOperationException("Implement this method");
        // SOLUTION END
    }
}
