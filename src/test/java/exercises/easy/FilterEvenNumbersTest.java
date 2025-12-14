package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class FilterEvenNumbersTest {

    @Test
    void testFilterEven_withMixedNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = FilterEvenNumbers.filterEven(numbers);
        assertEquals(List.of(2, 4, 6, 8, 10), result);
    }

    @Test
    void testFilterEven_withOnlyOddNumbers() {
        List<Integer> numbers = List.of(1, 3, 5, 7, 9);
        List<Integer> result = FilterEvenNumbers.filterEven(numbers);
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilterEven_withOnlyEvenNumbers() {
        List<Integer> numbers = List.of(2, 4, 6, 8);
        List<Integer> result = FilterEvenNumbers.filterEven(numbers);
        assertEquals(List.of(2, 4, 6, 8), result);
    }

    @Test
    void testFilterEven_withEmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> result = FilterEvenNumbers.filterEven(numbers);
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilterEven_withNegativeNumbers() {
        List<Integer> numbers = List.of(-4, -3, -2, -1, 0, 1, 2);
        List<Integer> result = FilterEvenNumbers.filterEven(numbers);
        assertEquals(List.of(-4, -2, 0, 2), result);
    }
}
