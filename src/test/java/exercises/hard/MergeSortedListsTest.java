package exercises.hard;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedListsTest {

    @Test
    void testMerge_withMultipleSortedLists() {
        List<List<Integer>> sortedLists = List.of(
                List.of(1, 3, 5),
                List.of(2, 4, 6),
                List.of(0, 7, 8));
        List<Integer> result = MergeSortedLists.merge(sortedLists);
        assertEquals(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8), result);
    }

    @Test
    void testMerge_withEmptyLists() {
        List<List<Integer>> sortedLists = List.of(
                List.of(1, 2, 3),
                List.of(),
                List.of(4, 5, 6));
        List<Integer> result = MergeSortedLists.merge(sortedLists);
        assertEquals(List.of(1, 2, 3, 4, 5, 6), result);
    }

    @Test
    void testMerge_withAllEmptyLists() {
        List<List<Integer>> sortedLists = List.of(
                List.of(),
                List.of(),
                List.of());
        List<Integer> result = MergeSortedLists.merge(sortedLists);
        assertTrue(result.isEmpty());
    }

    @Test
    void testMerge_withSingleList() {
        List<List<Integer>> sortedLists = List.of(
                List.of(1, 2, 3, 4, 5));
        List<Integer> result = MergeSortedLists.merge(sortedLists);
        assertEquals(List.of(1, 2, 3, 4, 5), result);
    }

    @Test
    void testMerge_withNegativeNumbers() {
        List<List<Integer>> sortedLists = List.of(
                List.of(-5, -3, -1),
                List.of(-4, -2, 0),
                List.of(1, 2, 3));
        List<Integer> result = MergeSortedLists.merge(sortedLists);
        assertEquals(List.of(-5, -4, -3, -2, -1, 0, 1, 2, 3), result);
    }

    @Test
    void testMerge_withDuplicates() {
        List<List<Integer>> sortedLists = List.of(
                List.of(1, 2, 3),
                List.of(2, 3, 4),
                List.of(3, 4, 5));
        List<Integer> result = MergeSortedLists.merge(sortedLists);
        assertEquals(List.of(1, 2, 2, 3, 3, 3, 4, 4, 5), result);
    }

    @Test
    void testMerge_withDifferentSizes() {
        List<List<Integer>> sortedLists = List.of(
                List.of(1),
                List.of(2, 3, 4, 5),
                List.of(6, 7));
        List<Integer> result = MergeSortedLists.merge(sortedLists);
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7), result);
    }
}
