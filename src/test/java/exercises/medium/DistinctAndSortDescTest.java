package exercises.medium;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DistinctAndSortDescTest {

    @Test
    void testDistinctAndSortDesc_withDuplicates() {
        List<Integer> numbers = List.of(5, 2, 8, 2, 9, 5, 1, 8);
        List<Integer> result = DistinctAndSortDesc.distinctAndSortDesc(numbers);
        assertEquals(List.of(9, 8, 5, 2, 1), result);
    }

    @Test
    void testDistinctAndSortDesc_withNoDuplicates() {
        List<Integer> numbers = List.of(3, 1, 4, 1, 5, 9, 2, 6);
        List<Integer> result = DistinctAndSortDesc.distinctAndSortDesc(numbers);
        assertEquals(List.of(9, 6, 5, 4, 3, 2, 1), result);
    }

    @Test
    void testDistinctAndSortDesc_withAllSame() {
        List<Integer> numbers = List.of(7, 7, 7, 7);
        List<Integer> result = DistinctAndSortDesc.distinctAndSortDesc(numbers);
        assertEquals(List.of(7), result);
    }

    @Test
    void testDistinctAndSortDesc_withNegativeNumbers() {
        List<Integer> numbers = List.of(-5, 3, -5, 0, 3, -1);
        List<Integer> result = DistinctAndSortDesc.distinctAndSortDesc(numbers);
        assertEquals(List.of(3, 0, -1, -5), result);
    }

    @Test
    void testDistinctAndSortDesc_withEmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> result = DistinctAndSortDesc.distinctAndSortDesc(numbers);
        assertTrue(result.isEmpty());
    }

    @Test
    void testDistinctAndSortDesc_withAlreadySorted() {
        List<Integer> numbers = List.of(9, 7, 5, 3, 1);
        List<Integer> result = DistinctAndSortDesc.distinctAndSortDesc(numbers);
        assertEquals(List.of(9, 7, 5, 3, 1), result);
    }
}
