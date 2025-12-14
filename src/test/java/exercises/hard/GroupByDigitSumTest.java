package exercises.hard;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GroupByDigitSumTest {

    @Test
    void testGroupByDigitSum_withVariousNumbers() {
        List<Integer> numbers = List.of(10, 11, 20, 101, 110, 200);
        Map<Integer, List<Integer>> result = GroupByDigitSum.groupByDigitSum(numbers);

        assertEquals(List.of(10), result.get(1));
        assertEquals(List.of(11, 20, 101, 110, 200), result.get(2));
    }

    @Test
    void testGroupByDigitSum_withSingleDigits() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Map<Integer, List<Integer>> result = GroupByDigitSum.groupByDigitSum(numbers);

        assertEquals(5, result.size());
        assertEquals(List.of(1), result.get(1));
        assertEquals(List.of(5), result.get(5));
    }

    @Test
    void testGroupByDigitSum_withLargeNumbers() {
        List<Integer> numbers = List.of(123, 321, 456, 654);
        Map<Integer, List<Integer>> result = GroupByDigitSum.groupByDigitSum(numbers);

        // 123 and 321 both sum to 6
        // 456 and 654 both sum to 15
        assertEquals(List.of(123, 321), result.get(6));
        assertEquals(List.of(456, 654), result.get(15));
    }

    @Test
    void testGroupByDigitSum_withZeros() {
        List<Integer> numbers = List.of(0, 10, 100, 1000);
        Map<Integer, List<Integer>> result = GroupByDigitSum.groupByDigitSum(numbers);

        assertEquals(List.of(0), result.get(0));
        assertEquals(List.of(10, 100, 1000), result.get(1));
    }

    @Test
    void testGroupByDigitSum_withEmptyList() {
        List<Integer> numbers = List.of();
        Map<Integer, List<Integer>> result = GroupByDigitSum.groupByDigitSum(numbers);

        assertTrue(result.isEmpty());
    }

    @Test
    void testGroupByDigitSum_withSameDigitSum() {
        List<Integer> numbers = List.of(12, 21, 30, 111);
        Map<Integer, List<Integer>> result = GroupByDigitSum.groupByDigitSum(numbers);

        assertEquals(List.of(12, 21, 30, 111), result.get(3));
    }
}
