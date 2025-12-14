package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class SortNumbersTest {

    @Test
    void testSort_withUnsortedNumbers() {
        List<Integer> numbers = List.of(5, 2, 8, 1, 9, 3);
        List<Integer> result = SortNumbers.sort(numbers);
        assertEquals(List.of(1, 2, 3, 5, 8, 9), result);
    }

    @Test
    void testSort_withAlreadySortedNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> result = SortNumbers.sort(numbers);
        assertEquals(List.of(1, 2, 3, 4, 5), result);
    }

    @Test
    void testSort_withReverseSortedNumbers() {
        List<Integer> numbers = List.of(5, 4, 3, 2, 1);
        List<Integer> result = SortNumbers.sort(numbers);
        assertEquals(List.of(1, 2, 3, 4, 5), result);
    }

    @Test
    void testSort_withNegativeNumbers() {
        List<Integer> numbers = List.of(-5, 3, -1, 0, 2);
        List<Integer> result = SortNumbers.sort(numbers);
        assertEquals(List.of(-5, -1, 0, 2, 3), result);
    }

    @Test
    void testSort_withEmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> result = SortNumbers.sort(numbers);
        assertTrue(result.isEmpty());
    }
}
