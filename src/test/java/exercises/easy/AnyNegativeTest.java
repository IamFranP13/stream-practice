package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class AnyNegativeTest {

    @Test
    void testHasNegative_withNegativeNumbers() {
        List<Integer> numbers = List.of(1, 2, -3, 4, 5);
        boolean result = AnyNegative.hasNegative(numbers);
        assertTrue(result);
    }

    @Test
    void testHasNegative_withAllPositive() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        boolean result = AnyNegative.hasNegative(numbers);
        assertFalse(result);
    }

    @Test
    void testHasNegative_withAllNegative() {
        List<Integer> numbers = List.of(-1, -2, -3);
        boolean result = AnyNegative.hasNegative(numbers);
        assertTrue(result);
    }

    @Test
    void testHasNegative_withZero() {
        List<Integer> numbers = List.of(0, 1, 2);
        boolean result = AnyNegative.hasNegative(numbers);
        assertFalse(result);
    }

    @Test
    void testHasNegative_withEmptyList() {
        List<Integer> numbers = List.of();
        boolean result = AnyNegative.hasNegative(numbers);
        assertFalse(result);
    }
}
