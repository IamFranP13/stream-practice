package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates_withDuplicates() {
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 3, 4, 5, 5);
        List<Integer> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(List.of(1, 2, 3, 4, 5), result);
    }

    @Test
    void testRemoveDuplicates_withNoDuplicates() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(List.of(1, 2, 3, 4, 5), result);
    }

    @Test
    void testRemoveDuplicates_withAllSameNumbers() {
        List<Integer> numbers = List.of(7, 7, 7, 7, 7);
        List<Integer> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(List.of(7), result);
    }

    @Test
    void testRemoveDuplicates_withEmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> result = RemoveDuplicates.removeDuplicates(numbers);
        assertTrue(result.isEmpty());
    }

    @Test
    void testRemoveDuplicates_withNegativeNumbers() {
        List<Integer> numbers = List.of(-1, -1, 0, 0, 1, 1);
        List<Integer> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(List.of(-1, 0, 1), result);
    }
}
