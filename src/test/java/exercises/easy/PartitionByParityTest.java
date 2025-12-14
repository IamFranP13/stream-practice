package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class PartitionByParityTest {

    @Test
    void testPartition_withMixedNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> result = PartitionByParity.partition(numbers);

        assertEquals(List.of(2, 4, 6, 8, 10), result.get(true));
        assertEquals(List.of(1, 3, 5, 7, 9), result.get(false));
    }

    @Test
    void testPartition_withOnlyEven() {
        List<Integer> numbers = List.of(2, 4, 6, 8);
        Map<Boolean, List<Integer>> result = PartitionByParity.partition(numbers);

        assertEquals(List.of(2, 4, 6, 8), result.get(true));
        assertTrue(result.get(false).isEmpty());
    }

    @Test
    void testPartition_withOnlyOdd() {
        List<Integer> numbers = List.of(1, 3, 5, 7);
        Map<Boolean, List<Integer>> result = PartitionByParity.partition(numbers);

        assertTrue(result.get(true).isEmpty());
        assertEquals(List.of(1, 3, 5, 7), result.get(false));
    }

    @Test
    void testPartition_withEmptyList() {
        List<Integer> numbers = List.of();
        Map<Boolean, List<Integer>> result = PartitionByParity.partition(numbers);

        assertTrue(result.get(true).isEmpty());
        assertTrue(result.get(false).isEmpty());
    }

    @Test
    void testPartition_withNegativeNumbers() {
        List<Integer> numbers = List.of(-4, -3, -2, -1, 0, 1, 2);
        Map<Boolean, List<Integer>> result = PartitionByParity.partition(numbers);

        assertEquals(List.of(-4, -2, 0, 2), result.get(true));
        assertEquals(List.of(-3, -1, 1), result.get(false));
    }
}
