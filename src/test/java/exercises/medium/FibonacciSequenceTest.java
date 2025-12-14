package exercises.medium;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceTest {

    @Test
    void testGenerateFibonacci_first10() {
        List<Integer> result = FibonacciSequence.generateFibonacci(10);
        assertEquals(List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34), result);
    }

    @Test
    void testGenerateFibonacci_first5() {
        List<Integer> result = FibonacciSequence.generateFibonacci(5);
        assertEquals(List.of(0, 1, 1, 2, 3), result);
    }

    @Test
    void testGenerateFibonacci_first1() {
        List<Integer> result = FibonacciSequence.generateFibonacci(1);
        assertEquals(List.of(0), result);
    }

    @Test
    void testGenerateFibonacci_first2() {
        List<Integer> result = FibonacciSequence.generateFibonacci(2);
        assertEquals(List.of(0, 1), result);
    }

    @Test
    void testGenerateFibonacci_zero() {
        List<Integer> result = FibonacciSequence.generateFibonacci(0);
        assertTrue(result.isEmpty());
    }

    @Test
    void testGenerateFibonacci_first15() {
        List<Integer> result = FibonacciSequence.generateFibonacci(15);
        assertEquals(15, result.size());
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
        assertEquals(1, result.get(2));
        assertEquals(377, result.get(14)); // 15th Fibonacci number
    }
}
