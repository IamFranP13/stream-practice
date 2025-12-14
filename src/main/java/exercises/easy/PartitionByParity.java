package exercises.easy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Partition numbers into even and odd
 */
public class PartitionByParity {

    /**
     * Partitions numbers into even (true) and odd (false)
     * 
     * @param numbers list of integers
     * @return map with true key for even numbers and false key for odd numbers
     */
    public static Map<Boolean, List<Integer>> partition(List<Integer> numbers) {
        // TODO: Implementa este método usando streams
        // Pista: usa collect() con Collectors.partitioningBy()
        return numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }
}
