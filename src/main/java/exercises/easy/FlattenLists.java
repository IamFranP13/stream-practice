package exercises.easy;

import java.util.List;

/**
 * Flatten a list of lists into a single list
 */
public class FlattenLists {

    /**
     * Flattens a list of lists into a single list
     * 
     * @param lists list of lists of integers
     * @return single flattened list containing all elements
     */
    public static List<Integer> flatten(List<List<Integer>> lists) {
        // TODO: Implementa este método usando streams
        // Pista: usa flatMap() y toList()
        return lists.stream().flatMap(List::stream).toList();

    }
}
