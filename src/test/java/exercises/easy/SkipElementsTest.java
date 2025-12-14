package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class SkipElementsTest {

    @Test
    void testSkipFirst_withNLessThanSize() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = SkipElements.skipFirst(numbers, 5);
        assertEquals(List.of(6, 7, 8, 9, 10), result);
    }

    @Test
    void testSkipFirst_withNEqualToSize() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> result = SkipElements.skipFirst(numbers, 5);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSkipFirst_withNGreaterThanSize() {
        List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> result = SkipElements.skipFirst(numbers, 10);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSkipFirst_withZero() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> result = SkipElements.skipFirst(numbers, 0);
        assertEquals(List.of(1, 2, 3, 4, 5), result);
    }

    @Test
    void testSkipFirst_withEmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> result = SkipElements.skipFirst(numbers, 3);
        assertTrue(result.isEmpty());
    }
}
