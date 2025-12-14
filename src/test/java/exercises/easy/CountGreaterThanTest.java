package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class CountGreaterThanTest {

    @Test
    void testCount_withNumbersGreaterThanThreshold() {
        List<Integer> numbers = List.of(1, 5, 10, 15, 20);
        long result = CountGreaterThan.count(numbers, 10);
        assertEquals(2, result);
    }

    @Test
    void testCount_withNoNumbersGreaterThanThreshold() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        long result = CountGreaterThan.count(numbers, 10);
        assertEquals(0, result);
    }

    @Test
    void testCount_withAllNumbersGreaterThanThreshold() {
        List<Integer> numbers = List.of(11, 12, 13, 14, 15);
        long result = CountGreaterThan.count(numbers, 10);
        assertEquals(5, result);
    }

    @Test
    void testCount_withEmptyList() {
        List<Integer> numbers = List.of();
        long result = CountGreaterThan.count(numbers, 5);
        assertEquals(0, result);
    }

    @Test
    void testCount_withNegativeThreshold() {
        List<Integer> numbers = List.of(-5, -3, 0, 3, 5);
        long result = CountGreaterThan.count(numbers, -4);
        assertEquals(4, result);
    }
}
