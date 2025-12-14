package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class SumNumbersTest {

    @Test
    void testSum_withPositiveNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int result = SumNumbers.sum(numbers);
        assertEquals(15, result);
    }

    @Test
    void testSum_withNegativeNumbers() {
        List<Integer> numbers = List.of(-1, -2, -3, -4, -5);
        int result = SumNumbers.sum(numbers);
        assertEquals(-15, result);
    }

    @Test
    void testSum_withMixedNumbers() {
        List<Integer> numbers = List.of(-5, -3, 0, 3, 5);
        int result = SumNumbers.sum(numbers);
        assertEquals(0, result);
    }

    @Test
    void testSum_withEmptyList() {
        List<Integer> numbers = List.of();
        int result = SumNumbers.sum(numbers);
        assertEquals(0, result);
    }

    @Test
    void testSum_withSingleNumber() {
        List<Integer> numbers = List.of(42);
        int result = SumNumbers.sum(numbers);
        assertEquals(42, result);
    }
}
