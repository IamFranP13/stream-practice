package exercises.hard;

import java.util.List;
import java.util.stream.IntStream;

/**
 * Transpose a matrix represented as list of lists
 * Hard difficulty: requires complex stream transformations with indices
 */
public class TransposeMatrix {

    /**
     * Transposes a matrix (swaps rows and columns)
     * For example:
     * [[1, 2, 3], [[1, 4],
     * [4, 5, 6]] -> [2, 5],
     * [3, 6]]
     * 
     * @param matrix list of lists representing a matrix
     * @return transposed matrix
     */
    public static List<List<Integer>> transpose(List<List<Integer>> matrix) {
        // TODO: Implementa este método usando streams
        // Pista: necesitas trabajar con índices de columnas
        // Usa IntStream.range() para las columnas
        // Para cada columna, mapea todos los elementos de esa columna de cada fila
        // SOLUTION START
        throw new UnsupportedOperationException("Implementa este método");
        // SOLUTION END
    }
}
