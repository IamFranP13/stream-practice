package exercises.hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Find anagrams in a list of words
 * Hard difficulty: requires grouping by sorted characters
 */
public class FindAnagrams {

    /**
     * Groups words that are anagrams of each other
     * 
     * @param words list of words
     * @return map where key is the sorted characters and value is list of anagrams
     *         Only includes groups with more than one word
     */
    public static Map<String, List<String>> findAnagramGroups(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toLowerCase().toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() > 1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
    }
}
