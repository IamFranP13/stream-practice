package exercises.hard;

import java.util.List;
import java.util.stream.IntStream;

public class FindPairsWithSum {

    public static List<List<Integer>> findPairs(List<Integer> numbers, int target) {
        int n = numbers.size();

        return IntStream.range(0, n)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, n)
                        .mapToObj(j -> List.of(numbers.get(i), numbers.get(j))))
                .filter(pair -> pair.get(0) + pair.get(1) == target)
                .map(pair -> {
                    int a = pair.get(0);
                    int b = pair.get(1);
                    return a <= b ? pair : List.of(b, a);
                })
                .distinct()
                .toList();
    }
}
