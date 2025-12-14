package exercises.medium;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TopNLargestTest {

    @Test
    void testGetTopN_withNLessThanSize() {
        List<Integer> numbers = List.of(5, 2, 8, 1, 9, 3, 7, 4, 6);
        List<Integer> result = TopNLargest.getTopN(numbers, 3);
        assertEquals(List.of(9, 8, 7), result);
    }

    @Test
    void testGetTopN_withNEqualToSize() {
        List<Integer> numbers = List.of(3, 1, 4, 1, 5);
        List<Integer> result = TopNLargest.getTopN(numbers, 5);
        assertEquals(List.of(5, 4, 3, 1, 1), result);
    }

    @Test
    void testGetTopN_withNGreaterThanSize() {
        List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> result = TopNLargest.getTopN(numbers, 10);
        assertEquals(List.of(3, 2, 1), result);
    }

    @Test
    void testGetTopN_withNegativeNumbers() {
        List<Integer> numbers = List.of(-5, 10, -3, 7, 0, -1);
        List<Integer> result = TopNLargest.getTopN(numbers, 3);
        assertEquals(List.of(10, 7, 0), result);
    }

    @Test
    void testGetTopN_withDuplicates() {
        List<Integer> numbers = List.of(5, 5, 3, 3, 1, 1);
        List<Integer> result = TopNLargest.getTopN(numbers, 4);
        assertEquals(List.of(5, 5, 3, 3), result);
    }

    @Test
    void testGetTopN_withEmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> result = TopNLargest.getTopN(numbers, 3);
        assertTrue(result.isEmpty());
    }
}
