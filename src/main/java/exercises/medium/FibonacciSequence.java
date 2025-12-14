package exercises.medium;

import java.util.List;
import java.util.stream.Stream;

/**
 * Generate Fibonacci sequence using streams
 * Medium difficulty: requires Stream.iterate or custom generation
 */
public class FibonacciSequence {

    /**
     * Generates the first N numbers of the Fibonacci sequence
     * 
     * @param n number of Fibonacci numbers to generate
     * @return list containing first N Fibonacci numbers
     */
    public static List<Integer> generateFibonacci(int n) {
        // TODO: Implementa este método usando streams
        // Pista: usa Stream.iterate() con un array de 2 elementos [a, b]
        // o usa IntStream.range() con una función que calcule cada número

        return Stream.iterate(new int[] { 0, 1 }, e -> new int[] { e[1], e[0] + e[1] })
                .map(e -> e[0])
                .limit(n)
                .toList();
    }

}
