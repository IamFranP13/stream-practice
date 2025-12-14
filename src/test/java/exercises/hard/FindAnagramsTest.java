package exercises.hard;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FindAnagramsTest {

    @Test
    void testFindAnagramGroups_withMultipleGroups() {
        List<String> words = List.of("listen", "silent", "enlist", "hello", "world");
        Map<String, List<String>> result = FindAnagrams.findAnagramGroups(words);

        assertEquals(1, result.size());
        assertTrue(result.values().stream()
                .anyMatch(group -> group.containsAll(List.of("listen", "silent", "enlist"))));
    }

    @Test
    void testFindAnagramGroups_withNoAnagrams() {
        List<String> words = List.of("hello", "world", "java", "stream");
        Map<String, List<String>> result = FindAnagrams.findAnagramGroups(words);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFindAnagramGroups_withAllAnagrams() {
        List<String> words = List.of("abc", "bca", "cab", "acb");
        Map<String, List<String>> result = FindAnagrams.findAnagramGroups(words);

        assertEquals(1, result.size());
        assertEquals(4, result.values().iterator().next().size());
    }

    @Test
    void testFindAnagramGroups_caseInsensitive() {
        List<String> words = List.of("Listen", "Silent", "listen", "silent");
        Map<String, List<String>> result = FindAnagrams.findAnagramGroups(words);

        // Ignorando mayúsculas, las 4 palabras son anagramas entre sí
        assertEquals(1, result.size());
        List<String> group = result.values().iterator().next();
        assertTrue(group.containsAll(List.of("Listen", "Silent", "listen", "silent")));
    }

    @Test
    void testFindAnagramGroups_withEmptyList() {
        List<String> words = List.of();
        Map<String, List<String>> result = FindAnagrams.findAnagramGroups(words);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFindAnagramGroups_withSingleLetters() {
        List<String> words = List.of("a", "b", "c", "a", "b");
        Map<String, List<String>> result = FindAnagrams.findAnagramGroups(words);

        assertEquals(2, result.size());
        assertTrue(result.values().stream().anyMatch(group -> group.equals(List.of("a", "a"))));
        assertTrue(result.values().stream().anyMatch(group -> group.equals(List.of("b", "b"))));
    }

    @Test
    void testFindAnagramGroups_onlyGroupsWithMoreThanOneWord() {
        List<String> words = List.of("listen", "silent", "hello");
        Map<String, List<String>> result = FindAnagrams.findAnagramGroups(words);

        assertEquals(1, result.size());
        assertTrue(result.values().stream().allMatch(group -> group.size() > 1));
    }
}
