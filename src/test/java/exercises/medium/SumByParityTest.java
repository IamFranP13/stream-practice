package exercises.medium;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SumByParityTest {

    @Test
    void testSumByParity_withMixedNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, Integer> result = SumByParity.sumByParity(numbers);

        assertEquals(30, result.get(true)); // 2+4+6+8+10
        assertEquals(25, result.get(false)); // 1+3+5+7+9
    }

    @Test
    void testSumByParity_withOnlyEven() {
        List<Integer> numbers = List.of(2, 4, 6, 8);
        Map<Boolean, Integer> result = SumByParity.sumByParity(numbers);

        assertEquals(20, result.get(true));
        assertEquals(0, result.get(false));
    }

    @Test
    void testSumByParity_withOnlyOdd() {
        List<Integer> numbers = List.of(1, 3, 5, 7);
        Map<Boolean, Integer> result = SumByParity.sumByParity(numbers);

        assertEquals(0, result.get(true));
        assertEquals(16, result.get(false));
    }

    @Test
    void testSumByParity_withNegativeNumbers() {
        List<Integer> numbers = List.of(-4, -3, -2, -1, 0, 1, 2);
        Map<Boolean, Integer> result = SumByParity.sumByParity(numbers);

        assertEquals(-4, result.get(true)); // -4 + -2 + 0 + 2
        assertEquals(-3, result.get(false)); // -3 + -1 + 1
    }

    @Test
    void testSumByParity_withEmptyList() {
        List<Integer> numbers = List.of();
        Map<Boolean, Integer> result = SumByParity.sumByParity(numbers);

        assertEquals(0, result.get(true));
        assertEquals(0, result.get(false));
    }

    @Test
    void testSumByParity_withZeros() {
        List<Integer> numbers = List.of(0, 0, 0, 1, 2);
        Map<Boolean, Integer> result = SumByParity.sumByParity(numbers);

        assertEquals(2, result.get(true)); // 0+0+0+2
        assertEquals(1, result.get(false)); // 1
    }
}
