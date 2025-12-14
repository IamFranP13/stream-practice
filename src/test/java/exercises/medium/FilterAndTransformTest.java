package exercises.medium;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterAndTransformTest {

    @Test
    void testFilterRangeAndSquare_withNumbersInRange() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = FilterAndTransform.filterRangeAndSquare(numbers, 3, 7);
        assertEquals(List.of(9, 16, 25, 36, 49), result);
    }

    @Test
    void testFilterRangeAndSquare_withNoNumbersInRange() {
        List<Integer> numbers = List.of(1, 2, 10, 11, 12);
        List<Integer> result = FilterAndTransform.filterRangeAndSquare(numbers, 3, 9);
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilterRangeAndSquare_withAllNumbersInRange() {
        List<Integer> numbers = List.of(5, 6, 7, 8);
        List<Integer> result = FilterAndTransform.filterRangeAndSquare(numbers, 5, 8);
        assertEquals(List.of(25, 36, 49, 64), result);
    }

    @Test
    void testFilterRangeAndSquare_withNegativeRange() {
        List<Integer> numbers = List.of(-5, -3, -1, 0, 1, 3, 5);
        List<Integer> result = FilterAndTransform.filterRangeAndSquare(numbers, -3, 1);
        assertEquals(List.of(9, 1, 0, 1), result);
    }

    @Test
    void testFilterRangeAndSquare_withEmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> result = FilterAndTransform.filterRangeAndSquare(numbers, 1, 10);
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilterRangeAndSquare_withSingleValue() {
        List<Integer> numbers = List.of(1, 2, 5, 5, 5, 8, 9);
        List<Integer> result = FilterAndTransform.filterRangeAndSquare(numbers, 5, 5);
        assertEquals(List.of(25, 25, 25), result);
    }
}
