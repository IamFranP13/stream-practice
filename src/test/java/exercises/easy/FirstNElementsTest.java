package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class FirstNElementsTest {

    @Test
    void testGetFirstN_withNLessThanListSize() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = FirstNElements.getFirstN(numbers, 5);
        assertEquals(List.of(1, 2, 3, 4, 5), result);
    }

    @Test
    void testGetFirstN_withNEqualToListSize() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> result = FirstNElements.getFirstN(numbers, 5);
        assertEquals(List.of(1, 2, 3, 4, 5), result);
    }

    @Test
    void testGetFirstN_withNGreaterThanListSize() {
        List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> result = FirstNElements.getFirstN(numbers, 10);
        assertEquals(List.of(1, 2, 3), result);
    }

    @Test
    void testGetFirstN_withZero() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> result = FirstNElements.getFirstN(numbers, 0);
        assertTrue(result.isEmpty());
    }

    @Test
    void testGetFirstN_withEmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> result = FirstNElements.getFirstN(numbers, 5);
        assertTrue(result.isEmpty());
    }
}
