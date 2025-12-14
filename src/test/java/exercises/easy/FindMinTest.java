package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class FindMinTest {

    @Test
    void testFindMin_withPositiveNumbers() {
        List<Integer> numbers = List.of(5, 2, 8, 1, 9);
        Optional<Integer> result = FindMin.findMin(numbers);
        assertTrue(result.isPresent());
        assertEquals(1, result.get());
    }

    @Test
    void testFindMin_withNegativeNumbers() {
        List<Integer> numbers = List.of(-5, -20, -1, -10);
        Optional<Integer> result = FindMin.findMin(numbers);
        assertTrue(result.isPresent());
        assertEquals(-20, result.get());
    }

    @Test
    void testFindMin_withMixedNumbers() {
        List<Integer> numbers = List.of(10, -5, 0, 3, -2);
        Optional<Integer> result = FindMin.findMin(numbers);
        assertTrue(result.isPresent());
        assertEquals(-5, result.get());
    }

    @Test
    void testFindMin_withEmptyList() {
        List<Integer> numbers = List.of();
        Optional<Integer> result = FindMin.findMin(numbers);
        assertFalse(result.isPresent());
    }

    @Test
    void testFindMin_withSingleNumber() {
        List<Integer> numbers = List.of(42);
        Optional<Integer> result = FindMin.findMin(numbers);
        assertTrue(result.isPresent());
        assertEquals(42, result.get());
    }
}
