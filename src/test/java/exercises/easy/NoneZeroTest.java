package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class NoneZeroTest {

    @Test
    void testNoneAreZero_withNoZeros() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        boolean result = NoneZero.noneAreZero(numbers);
        assertTrue(result);
    }

    @Test
    void testNoneAreZero_withOneZero() {
        List<Integer> numbers = List.of(1, 0, 3, 4);
        boolean result = NoneZero.noneAreZero(numbers);
        assertFalse(result);
    }

    @Test
    void testNoneAreZero_withMultipleZeros() {
        List<Integer> numbers = List.of(0, 0, 0);
        boolean result = NoneZero.noneAreZero(numbers);
        assertFalse(result);
    }

    @Test
    void testNoneAreZero_withNegativeNumbers() {
        List<Integer> numbers = List.of(-5, -3, -1, 1, 3, 5);
        boolean result = NoneZero.noneAreZero(numbers);
        assertTrue(result);
    }

    @Test
    void testNoneAreZero_withEmptyList() {
        List<Integer> numbers = List.of();
        boolean result = NoneZero.noneAreZero(numbers);
        assertTrue(result);
    }
}
