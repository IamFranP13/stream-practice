package exercises.medium;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordsTest {

    @Test
    void testGetUniqueWords_withDuplicates() {
        List<String> sentences = List.of(
                "hello world",
                "hello java",
                "world of java");
        List<String> result = UniqueWords.getUniqueWords(sentences);
        assertEquals(List.of("hello", "java", "of", "world"), result);
    }

    @Test
    void testGetUniqueWords_withDifferentCases() {
        List<String> sentences = List.of(
                "Hello World",
                "HELLO Java",
                "world OF java");
        List<String> result = UniqueWords.getUniqueWords(sentences);
        assertEquals(List.of("hello", "java", "of", "world"), result);
    }

    @Test
    void testGetUniqueWords_withNoDuplicates() {
        List<String> sentences = List.of(
                "apple banana",
                "cherry date");
        List<String> result = UniqueWords.getUniqueWords(sentences);
        assertEquals(List.of("apple", "banana", "cherry", "date"), result);
    }

    @Test
    void testGetUniqueWords_withEmptyList() {
        List<String> sentences = List.of();
        List<String> result = UniqueWords.getUniqueWords(sentences);
        assertTrue(result.isEmpty());
    }

    @Test
    void testGetUniqueWords_withSingleWord() {
        List<String> sentences = List.of("hello", "hello", "HELLO");
        List<String> result = UniqueWords.getUniqueWords(sentences);
        assertEquals(List.of("hello"), result);
    }

    @Test
    void testGetUniqueWords_withMultipleSpaces() {
        List<String> sentences = List.of(
                "hello  world",
                "java   streams");
        List<String> result = UniqueWords.getUniqueWords(sentences);
        // Note: split(" ") will create empty strings with multiple spaces
        // Students need to handle this
        assertTrue(result.contains("hello"));
        assertTrue(result.contains("world"));
        assertTrue(result.contains("java"));
        assertTrue(result.contains("streams"));
    }
}
