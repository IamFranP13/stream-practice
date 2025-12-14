package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class ProductOfNumbersTest {

    @Test
    void testProduct_withPositiveNumbers() {
        List<Integer> numbers = List.of(2, 3, 4);
        int result = ProductOfNumbers.product(numbers);
        assertEquals(24, result);
    }

    @Test
    void testProduct_withNegativeNumbers() {
        List<Integer> numbers = List.of(-2, -3, -4);
        int result = ProductOfNumbers.product(numbers);
        assertEquals(-24, result);
    }

    @Test
    void testProduct_withMixedNumbers() {
        List<Integer> numbers = List.of(-2, 3, 4);
        int result = ProductOfNumbers.product(numbers);
        assertEquals(-24, result);
    }

    @Test
    void testProduct_withZero() {
        List<Integer> numbers = List.of(1, 2, 0, 4);
        int result = ProductOfNumbers.product(numbers);
        assertEquals(0, result);
    }

    @Test
    void testProduct_withEmptyList() {
        List<Integer> numbers = List.of();
        int result = ProductOfNumbers.product(numbers);
        assertEquals(1, result);
    }

    @Test
    void testProduct_withOne() {
        List<Integer> numbers = List.of(1, 1, 1, 1);
        int result = ProductOfNumbers.product(numbers);
        assertEquals(1, result);
    }

    @Test
    void testProduct_withSingleNumber() {
        List<Integer> numbers = List.of(5);
        int result = ProductOfNumbers.product(numbers);
        assertEquals(5, result);
    }
}
