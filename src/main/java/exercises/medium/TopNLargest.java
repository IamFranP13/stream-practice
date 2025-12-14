package exercises.medium;

import java.util.Comparator;
import java.util.List;

/**
 * Get top N largest numbers from a list
 * Medium difficulty: requires sorting and limiting
 */
public class TopNLargest {

    /**
     * Returns the top N largest numbers from the list in descending order
     * 
     * @param numbers list of integers
     * @param n       number of top elements to return
     * @return list of top N largest numbers
     */
    public static List<Integer> getTopN(List<Integer> numbers, int n) {
        // TODO: Implementa este método usando streams
        // Pista: usa sorted() con reverseOrder(), limit() y toList()
        return numbers.stream().sorted(Comparator.reverseOrder()).limit(n).toList();
    }
}
