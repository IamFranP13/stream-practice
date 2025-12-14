package exercises.medium;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LongestStringTest {

    @Test
    void testFindLongest_withDifferentLengths() {
        List<String> strings = List.of("a", "bb", "ccc", "dd", "e");
        Optional<String> result = LongestString.findLongest(strings);
        assertTrue(result.isPresent());
        assertEquals("ccc", result.get());
    }

    @Test
    void testFindLongest_withSameLengths() {
        List<String> strings = List.of("cat", "dog", "fox");
        Optional<String> result = LongestString.findLongest(strings);
        assertTrue(result.isPresent());
        assertEquals("cat", result.get()); // First one with max length
    }

    @Test
    void testFindLongest_withEmptyList() {
        List<String> strings = List.of();
        Optional<String> result = LongestString.findLongest(strings);
        assertFalse(result.isPresent());
    }

    @Test
    void testFindLongest_withSingleString() {
        List<String> strings = List.of("hello");
        Optional<String> result = LongestString.findLongest(strings);
        assertTrue(result.isPresent());
        assertEquals("hello", result.get());
    }

    @Test
    void testFindLongest_withEmptyStrings() {
        List<String> strings = List.of("", "a", "", "bb");
        Optional<String> result = LongestString.findLongest(strings);
        assertTrue(result.isPresent());
        assertEquals("bb", result.get());
    }

    @Test
    void testFindLongest_withMultipleLongest() {
        List<String> strings = List.of("short", "medium", "longest", "another");
        Optional<String> result = LongestString.findLongest(strings);
        assertTrue(result.isPresent());
        assertEquals("longest", result.get());
    }
}
