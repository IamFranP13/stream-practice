package exercises.hard;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindPairsWithSumTest {

    @Test
    void testFindPairs_withMultiplePairs() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<List<Integer>> result = FindPairsWithSum.findPairs(numbers, 6);

        assertEquals(2, result.size());
        assertTrue(result.contains(List.of(1, 5)));
        assertTrue(result.contains(List.of(2, 4)));
    }

    @Test
    void testFindPairs_withNoPairs() {
        List<Integer> numbers = List.of(1, 2, 3);
        List<List<Integer>> result = FindPairsWithSum.findPairs(numbers, 10);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFindPairs_withDuplicateNumbers() {
        List<Integer> numbers = List.of(1, 1, 2, 2, 3);
        List<List<Integer>> result = FindPairsWithSum.findPairs(numbers, 4);

        // Should find [1,3] and [2,2]
        assertTrue(result.size() >= 2);
        assertTrue(result.stream().anyMatch(pair -> pair.equals(List.of(1, 3))));
        assertTrue(result.stream().anyMatch(pair -> pair.equals(List.of(2, 2))));
    }

    @Test
    void testFindPairs_withNegativeNumbers() {
        List<Integer> numbers = List.of(-3, -1, 0, 1, 3);
        List<List<Integer>> result = FindPairsWithSum.findPairs(numbers, 0);

        assertEquals(2, result.size());
        assertTrue(result.contains(List.of(-3, 3)));
        assertTrue(result.contains(List.of(-1, 1)));
    }

    @Test
    void testFindPairs_withEmptyList() {
        List<Integer> numbers = List.of();
        List<List<Integer>> result = FindPairsWithSum.findPairs(numbers, 5);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFindPairs_withSinglePair() {
        List<Integer> numbers = List.of(2, 3, 7, 10);
        List<List<Integer>> result = FindPairsWithSum.findPairs(numbers, 9);

        assertEquals(1, result.size());
        assertEquals(List.of(2, 7), result.get(0));
    }

    @Test
    void testFindPairs_pairsAreSorted() {
        List<Integer> numbers = List.of(5, 1, 4, 2);
        List<List<Integer>> result = FindPairsWithSum.findPairs(numbers, 6);

        // Each pair should have smaller number first
        result.forEach(pair -> {
            assertEquals(2, pair.size());
            assertTrue(pair.get(0) <= pair.get(1));
        });
    }
}
