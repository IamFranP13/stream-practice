package exercises.hard;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MostFrequentElementTest {

    @Test
    void testFindMostFrequent_withClearWinner() {
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Integer result = MostFrequentElement.findMostFrequent(numbers);
        assertEquals(4, result);
    }

    @Test
    void testFindMostFrequent_withTie() {
        List<Integer> numbers = List.of(1, 1, 2, 2, 3, 3);
        Integer result = MostFrequentElement.findMostFrequent(numbers);
        assertNotNull(result);
        assertTrue(List.of(1, 2, 3).contains(result));
    }

    @Test
    void testFindMostFrequent_withAllUnique() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Integer result = MostFrequentElement.findMostFrequent(numbers);
        assertNotNull(result);
        assertTrue(numbers.contains(result));
    }

    @Test
    void testFindMostFrequent_withAllSame() {
        List<Integer> numbers = List.of(7, 7, 7, 7, 7);
        Integer result = MostFrequentElement.findMostFrequent(numbers);
        assertEquals(7, result);
    }

    @Test
    void testFindMostFrequent_withEmptyList() {
        List<Integer> numbers = List.of();
        Integer result = MostFrequentElement.findMostFrequent(numbers);
        assertNull(result);
    }

    @Test
    void testFindMostFrequent_withNegativeNumbers() {
        List<Integer> numbers = List.of(-1, -1, -1, 0, 0, 1);
        Integer result = MostFrequentElement.findMostFrequent(numbers);
        assertEquals(-1, result);
    }
}
