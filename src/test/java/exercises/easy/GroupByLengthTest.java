package exercises.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class GroupByLengthTest {

    @Test
    void testGroupByLength_withDifferentLengths() {
        List<String> strings = List.of("a", "bb", "ccc", "dd", "e", "fff");
        Map<Integer, List<String>> result = GroupByLength.groupByLength(strings);

        assertEquals(3, result.size());
        assertEquals(List.of("a", "e"), result.get(1));
        assertEquals(List.of("bb", "dd"), result.get(2));
        assertEquals(List.of("ccc", "fff"), result.get(3));
    }

    @Test
    void testGroupByLength_withSameLength() {
        List<String> strings = List.of("cat", "dog", "fox", "bat");
        Map<Integer, List<String>> result = GroupByLength.groupByLength(strings);

        assertEquals(1, result.size());
        assertEquals(List.of("cat", "dog", "fox", "bat"), result.get(3));
    }

    @Test
    void testGroupByLength_withEmptyList() {
        List<String> strings = List.of();
        Map<Integer, List<String>> result = GroupByLength.groupByLength(strings);

        assertTrue(result.isEmpty());
    }

    @Test
    void testGroupByLength_withEmptyStrings() {
        List<String> strings = List.of("", "a", "", "bb");
        Map<Integer, List<String>> result = GroupByLength.groupByLength(strings);

        assertEquals(3, result.size());
        assertEquals(2, result.get(0).size());
        assertEquals(1, result.get(1).size());
        assertEquals(1, result.get(2).size());
    }

    @Test
    void testGroupByLength_withSingleString() {
        List<String> strings = List.of("hello");
        Map<Integer, List<String>> result = GroupByLength.groupByLength(strings);

        assertEquals(1, result.size());
        assertEquals(List.of("hello"), result.get(5));
    }
}
