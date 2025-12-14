package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class FindMaxTest {

    @Test
    void testFindMax_withPositiveNumbers() {
        List<Integer> numbers = List.of(1, 5, 3, 9, 2);
        Optional<Integer> result = FindMax.findMax(numbers);
        assertTrue(result.isPresent());
        assertEquals(9, result.get());
    }

    @Test
    void testFindMax_withNegativeNumbers() {
        List<Integer> numbers = List.of(-10, -5, -20, -1);
        Optional<Integer> result = FindMax.findMax(numbers);
        assertTrue(result.isPresent());
        assertEquals(-1, result.get());
    }

    @Test
    void testFindMax_withMixedNumbers() {
        List<Integer> numbers = List.of(-5, 0, 10, -3, 7);
        Optional<Integer> result = FindMax.findMax(numbers);
        assertTrue(result.isPresent());
        assertEquals(10, result.get());
    }

    @Test
    void testFindMax_withEmptyList() {
        List<Integer> numbers = List.of();
        Optional<Integer> result = FindMax.findMax(numbers);
        assertFalse(result.isPresent());
    }

    @Test
    void testFindMax_withSingleNumber() {
        List<Integer> numbers = List.of(42);
        Optional<Integer> result = FindMax.findMax(numbers);
        assertTrue(result.isPresent());
        assertEquals(42, result.get());
    }
}
