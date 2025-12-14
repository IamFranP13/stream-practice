package exercises.easy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Group strings by their length
 */
public class GroupByLength {

    /**
     * Groups strings by their length
     * 
     * @param strings list of strings
     * @return map where key is length and value is list of strings with that length
     */
    public static Map<Integer, List<String>> groupByLength(List<String> strings) {
        // TODO: Implementa este método usando streams
        // Pista: usa collect() con Collectors.groupingBy()
        return strings.stream().collect(Collectors.groupingBy(String::length));
    }
}
