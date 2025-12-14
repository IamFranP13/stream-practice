package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class ToUpperCaseTest {

    @Test
    void testConvertToUpperCase_withLowercaseStrings() {
        List<String> strings = List.of("hello", "world", "java");
        List<String> result = ToUpperCase.convertToUpperCase(strings);
        assertEquals(List.of("HELLO", "WORLD", "JAVA"), result);
    }

    @Test
    void testConvertToUpperCase_withMixedCaseStrings() {
        List<String> strings = List.of("HeLLo", "WoRLd", "JaVa");
        List<String> result = ToUpperCase.convertToUpperCase(strings);
        assertEquals(List.of("HELLO", "WORLD", "JAVA"), result);
    }

    @Test
    void testConvertToUpperCase_withUppercaseStrings() {
        List<String> strings = List.of("HELLO", "WORLD");
        List<String> result = ToUpperCase.convertToUpperCase(strings);
        assertEquals(List.of("HELLO", "WORLD"), result);
    }

    @Test
    void testConvertToUpperCase_withEmptyList() {
        List<String> strings = List.of();
        List<String> result = ToUpperCase.convertToUpperCase(strings);
        assertTrue(result.isEmpty());
    }

    @Test
    void testConvertToUpperCase_withSpecialCharacters() {
        List<String> strings = List.of("hello!", "world123", "java@2025");
        List<String> result = ToUpperCase.convertToUpperCase(strings);
        assertEquals(List.of("HELLO!", "WORLD123", "JAVA@2025"), result);
    }
}
