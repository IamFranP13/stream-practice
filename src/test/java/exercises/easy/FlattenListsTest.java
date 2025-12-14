package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class FlattenListsTest {

    @Test
    void testFlatten_withMultipleLists() {
        List<List<Integer>> lists = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9));
        List<Integer> result = FlattenLists.flatten(lists);
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), result);
    }

    @Test
    void testFlatten_withDifferentSizes() {
        List<List<Integer>> lists = List.of(
                List.of(1),
                List.of(2, 3, 4),
                List.of(5, 6));
        List<Integer> result = FlattenLists.flatten(lists);
        assertEquals(List.of(1, 2, 3, 4, 5, 6), result);
    }

    @Test
    void testFlatten_withEmptyLists() {
        List<List<Integer>> lists = List.of(
                List.of(1, 2),
                List.of(),
                List.of(3, 4));
        List<Integer> result = FlattenLists.flatten(lists);
        assertEquals(List.of(1, 2, 3, 4), result);
    }

    @Test
    void testFlatten_withAllEmptyLists() {
        List<List<Integer>> lists = List.of(
                List.of(),
                List.of(),
                List.of());
        List<Integer> result = FlattenLists.flatten(lists);
        assertTrue(result.isEmpty());
    }

    @Test
    void testFlatten_withEmptyOuterList() {
        List<List<Integer>> lists = List.of();
        List<Integer> result = FlattenLists.flatten(lists);
        assertTrue(result.isEmpty());
    }

    @Test
    void testFlatten_withSingleList() {
        List<List<Integer>> lists = List.of(
                List.of(1, 2, 3, 4, 5));
        List<Integer> result = FlattenLists.flatten(lists);
        assertEquals(List.of(1, 2, 3, 4, 5), result);
    }
}
