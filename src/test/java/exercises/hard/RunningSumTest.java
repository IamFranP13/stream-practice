package exercises.hard;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumTest {

    @Test
    void testCalculateRunningSum_withPositiveNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> result = RunningSum.calculateRunningSum(numbers);
        assertEquals(List.of(1, 3, 6, 10, 15), result);
    }

    @Test
    void testCalculateRunningSum_withNegativeNumbers() {
        List<Integer> numbers = List.of(-1, -2, -3);
        List<Integer> result = RunningSum.calculateRunningSum(numbers);
        assertEquals(List.of(-1, -3, -6), result);
    }

    @Test
    void testCalculateRunningSum_withMixedNumbers() {
        List<Integer> numbers = List.of(1, -2, 3, -4, 5);
        List<Integer> result = RunningSum.calculateRunningSum(numbers);
        assertEquals(List.of(1, -1, 2, -2, 3), result);
    }

    @Test
    void testCalculateRunningSum_withZeros() {
        List<Integer> numbers = List.of(0, 0, 0, 0);
        List<Integer> result = RunningSum.calculateRunningSum(numbers);
        assertEquals(List.of(0, 0, 0, 0), result);
    }

    @Test
    void testCalculateRunningSum_withEmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> result = RunningSum.calculateRunningSum(numbers);
        assertTrue(result.isEmpty());
    }

    @Test
    void testCalculateRunningSum_withSingleNumber() {
        List<Integer> numbers = List.of(42);
        List<Integer> result = RunningSum.calculateRunningSum(numbers);
        assertEquals(List.of(42), result);
    }

    @Test
    void testCalculateRunningSum_withLargeNumbers() {
        List<Integer> numbers = List.of(100, 200, 300);
        List<Integer> result = RunningSum.calculateRunningSum(numbers);
        assertEquals(List.of(100, 300, 600), result);
    }
}
