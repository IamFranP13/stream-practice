package exercises.hard;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GroupStatisticsTest {

    @Test
    void testCalculateGroupStats_withMixedNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Map<Boolean, GroupStatistics.Stats> result = GroupStatistics.calculateGroupStats(numbers);

        // Even numbers: 2, 4, 6
        GroupStatistics.Stats evenStats = result.get(true);
        assertEquals(3, evenStats.count);
        assertEquals(4.0, evenStats.average, 0.001);
        assertEquals(2, evenStats.min);
        assertEquals(6, evenStats.max);

        // Odd numbers: 1, 3, 5
        GroupStatistics.Stats oddStats = result.get(false);
        assertEquals(3, oddStats.count);
        assertEquals(3.0, oddStats.average, 0.001);
        assertEquals(1, oddStats.min);
        assertEquals(5, oddStats.max);
    }

    @Test
    void testCalculateGroupStats_withOnlyEven() {
        List<Integer> numbers = List.of(2, 4, 6, 8);
        Map<Boolean, GroupStatistics.Stats> result = GroupStatistics.calculateGroupStats(numbers);

        GroupStatistics.Stats evenStats = result.get(true);
        assertEquals(4, evenStats.count);
        assertEquals(5.0, evenStats.average, 0.001);
        assertEquals(2, evenStats.min);
        assertEquals(8, evenStats.max);
    }

    @Test
    void testCalculateGroupStats_withOnlyOdd() {
        List<Integer> numbers = List.of(1, 3, 5, 7);
        Map<Boolean, GroupStatistics.Stats> result = GroupStatistics.calculateGroupStats(numbers);

        GroupStatistics.Stats oddStats = result.get(false);
        assertEquals(4, oddStats.count);
        assertEquals(4.0, oddStats.average, 0.001);
        assertEquals(1, oddStats.min);
        assertEquals(7, oddStats.max);
    }

    @Test
    void testCalculateGroupStats_withNegativeNumbers() {
        List<Integer> numbers = List.of(-4, -3, -2, -1, 0, 1, 2);
        Map<Boolean, GroupStatistics.Stats> result = GroupStatistics.calculateGroupStats(numbers);

        GroupStatistics.Stats evenStats = result.get(true);
        assertEquals(4, evenStats.count);
        assertEquals(-1.0, evenStats.average, 0.001);
        assertEquals(-4, evenStats.min);
        assertEquals(2, evenStats.max);

        GroupStatistics.Stats oddStats = result.get(false);
        assertEquals(3, oddStats.count);
        assertEquals(-1.0, oddStats.average, 0.001);
        assertEquals(-3, oddStats.min);
        assertEquals(1, oddStats.max);
    }

    @Test
    void testCalculateGroupStats_withSingleNumber() {
        List<Integer> numbers = List.of(5);
        Map<Boolean, GroupStatistics.Stats> result = GroupStatistics.calculateGroupStats(numbers);

        GroupStatistics.Stats oddStats = result.get(false);
        assertEquals(1, oddStats.count);
        assertEquals(5.0, oddStats.average, 0.001);
        assertEquals(5, oddStats.min);
        assertEquals(5, oddStats.max);
    }
}
