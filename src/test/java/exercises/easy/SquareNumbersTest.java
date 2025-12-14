package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class SquareNumbersTest {

    @Test
    void testSquare_withPositiveNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> result = SquareNumbers.square(numbers);
        assertEquals(List.of(1, 4, 9, 16, 25), result);
    }

    @Test
    void testSquare_withNegativeNumbers() {
        List<Integer> numbers = List.of(-1, -2, -3, -4);
        List<Integer> result = SquareNumbers.square(numbers);
        assertEquals(List.of(1, 4, 9, 16), result);
    }

    @Test
    void testSquare_withMixedNumbers() {
        List<Integer> numbers = List.of(-3, 0, 3);
        List<Integer> result = SquareNumbers.square(numbers);
        assertEquals(List.of(9, 0, 9), result);
    }

    @Test
    void testSquare_withZero() {
        List<Integer> numbers = List.of(0);
        List<Integer> result = SquareNumbers.square(numbers);
        assertEquals(List.of(0), result);
    }

    @Test
    void testSquare_withEmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> result = SquareNumbers.square(numbers);
        assertTrue(result.isEmpty());
    }
}
