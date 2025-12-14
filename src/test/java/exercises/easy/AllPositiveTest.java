package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class AllPositiveTest {

    @Test
    void testAreAllPositive_withAllPositiveNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        boolean result = AllPositive.areAllPositive(numbers);
        assertTrue(result);
    }

    @Test
    void testAreAllPositive_withSomeNegativeNumbers() {
        List<Integer> numbers = List.of(1, 2, -3, 4, 5);
        boolean result = AllPositive.areAllPositive(numbers);
        assertFalse(result);
    }

    @Test
    void testAreAllPositive_withAllNegativeNumbers() {
        List<Integer> numbers = List.of(-1, -2, -3, -4);
        boolean result = AllPositive.areAllPositive(numbers);
        assertFalse(result);
    }

    @Test
    void testAreAllPositive_withZero() {
        List<Integer> numbers = List.of(1, 2, 0, 3);
        boolean result = AllPositive.areAllPositive(numbers);
        assertFalse(result);
    }

    @Test
    void testAreAllPositive_withEmptyList() {
        List<Integer> numbers = List.of();
        boolean result = AllPositive.areAllPositive(numbers);
        assertTrue(result); // allMatch returns true for empty stream
    }
}
