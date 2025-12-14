package exercises.medium;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountFrequencyTest {

    @Test
    void testCountFrequency_withDuplicates() {
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Map<Integer, Long> result = CountFrequency.countFrequency(numbers);

        assertEquals(4, result.size());
        assertEquals(1L, result.get(1));
        assertEquals(2L, result.get(2));
        assertEquals(3L, result.get(3));
        assertEquals(4L, result.get(4));
    }

    @Test
    void testCountFrequency_withNoDuplicates() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Map<Integer, Long> result = CountFrequency.countFrequency(numbers);

        assertEquals(5, result.size());
        result.values().forEach(count -> assertEquals(1L, count));
    }

    @Test
    void testCountFrequency_withAllSame() {
        List<Integer> numbers = List.of(7, 7, 7, 7, 7);
        Map<Integer, Long> result = CountFrequency.countFrequency(numbers);

        assertEquals(1, result.size());
        assertEquals(5L, result.get(7));
    }

    @Test
    void testCountFrequency_withEmptyList() {
        List<Integer> numbers = List.of();
        Map<Integer, Long> result = CountFrequency.countFrequency(numbers);

        assertTrue(result.isEmpty());
    }

    @Test
    void testCountFrequency_withNegativeNumbers() {
        List<Integer> numbers = List.of(-1, -1, 0, 0, 0, 1, 1);
        Map<Integer, Long> result = CountFrequency.countFrequency(numbers);

        assertEquals(3, result.size());
        assertEquals(2L, result.get(-1));
        assertEquals(3L, result.get(0));
        assertEquals(2L, result.get(1));
    }
}
