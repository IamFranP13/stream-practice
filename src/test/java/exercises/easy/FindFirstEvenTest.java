package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class FindFirstEvenTest {

    @Test
    void testFindFirst_withEvenAtStart() {
        List<Integer> numbers = List.of(2, 3, 5, 7, 9);
        Optional<Integer> result = FindFirstEven.findFirst(numbers);
        assertTrue(result.isPresent());
        assertEquals(2, result.get());
    }

    @Test
    void testFindFirst_withEvenInMiddle() {
        List<Integer> numbers = List.of(1, 3, 4, 5, 7);
        Optional<Integer> result = FindFirstEven.findFirst(numbers);
        assertTrue(result.isPresent());
        assertEquals(4, result.get());
    }

    @Test
    void testFindFirst_withMultipleEvens() {
        List<Integer> numbers = List.of(1, 2, 4, 6, 8);
        Optional<Integer> result = FindFirstEven.findFirst(numbers);
        assertTrue(result.isPresent());
        assertEquals(2, result.get());
    }

    @Test
    void testFindFirst_withNoEvens() {
        List<Integer> numbers = List.of(1, 3, 5, 7, 9);
        Optional<Integer> result = FindFirstEven.findFirst(numbers);
        assertFalse(result.isPresent());
    }

    @Test
    void testFindFirst_withEmptyList() {
        List<Integer> numbers = List.of();
        Optional<Integer> result = FindFirstEven.findFirst(numbers);
        assertFalse(result.isPresent());
    }

    @Test
    void testFindFirst_withNegativeEven() {
        List<Integer> numbers = List.of(-3, -2, -1, 1);
        Optional<Integer> result = FindFirstEven.findFirst(numbers);
        assertTrue(result.isPresent());
        assertEquals(-2, result.get());
    }
}
