package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.OptionalDouble;

import org.junit.jupiter.api.Test;

class AverageOfNumbersTest {

    @Test
    void testAverage_withPositiveNumbers() {
        List<Integer> numbers = List.of(2, 4, 6, 8, 10);
        OptionalDouble result = AverageOfNumbers.average(numbers);
        assertTrue(result.isPresent());
        assertEquals(6.0, result.getAsDouble(), 0.001);
    }

    @Test
    void testAverage_withNegativeNumbers() {
        List<Integer> numbers = List.of(-10, -20, -30);
        OptionalDouble result = AverageOfNumbers.average(numbers);
        assertTrue(result.isPresent());
        assertEquals(-20.0, result.getAsDouble(), 0.001);
    }

    @Test
    void testAverage_withMixedNumbers() {
        List<Integer> numbers = List.of(-5, 0, 5, 10);
        OptionalDouble result = AverageOfNumbers.average(numbers);
        assertTrue(result.isPresent());
        assertEquals(2.5, result.getAsDouble(), 0.001);
    }

    @Test
    void testAverage_withEmptyList() {
        List<Integer> numbers = List.of();
        OptionalDouble result = AverageOfNumbers.average(numbers);
        assertFalse(result.isPresent());
    }

    @Test
    void testAverage_withSingleNumber() {
        List<Integer> numbers = List.of(42);
        OptionalDouble result = AverageOfNumbers.average(numbers);
        assertTrue(result.isPresent());
        assertEquals(42.0, result.getAsDouble(), 0.001);
    }

    @Test
    void testAverage_withOddCount() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        OptionalDouble result = AverageOfNumbers.average(numbers);
        assertTrue(result.isPresent());
        assertEquals(4.0, result.getAsDouble(), 0.001);
    }
}
