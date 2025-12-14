package exercises.hard;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Find the most frequent element in a list
 * Hard difficulty: requires grouping, counting, and finding max by value
 */
public class MostFrequentElement {

    /**
     * Finds the most frequent element in the list
     * If there are multiple elements with the same max frequency, returns any one
     * 
     * @param numbers list of integers
     * @return the most frequent number, or null if list is empty
     */
    public static Integer findMostFrequent(List<Integer> numbers) {
        // TODO: Implementa este método usando streams
        // Pista: agrupa por elemento, cuenta frecuencias, encuentra el máximo por valor
        // Usa Collectors.groupingBy(), Collectors.counting(), y max()
        if (numbers.isEmpty()) {
            return null;
        }

        return numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
}
