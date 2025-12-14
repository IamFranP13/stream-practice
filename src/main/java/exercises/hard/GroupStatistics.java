package exercises.hard;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Calculate statistics for each group
 * Hard difficulty: requires grouping with complex downstream collectors
 */
public class GroupStatistics {

    /**
     * Statistics for a group of numbers
     */
    public static class Stats {
        public final long count;
        public final double average;
        public final int min;
        public final int max;

        public Stats(long count, double average, int min, int max) {
            this.count = count;
            this.average = average;
            this.min = min;
            this.max = max;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Stats stats = (Stats) o;
            return count == stats.count &&
                    Double.compare(stats.average, average) == 0 &&
                    min == stats.min &&
                    max == stats.max;
        }
    }

    /**
     * Groups numbers by even/odd and calculates statistics for each group
     * 
     * @param numbers list of integers
     * @return map with true for even numbers and false for odd numbers,
     *         each containing statistics (count, average, min, max)
     */
    public static Map<Boolean, Stats> calculateGroupStats(List<Integer> numbers) {
        // TODO: Implementa este método usando streams
        // Pista: usa Collectors.partitioningBy() con un collector personalizado
        // Necesitarás usar Collectors.collectingAndThen() o crear tu propio collector
        // Para obtener múltiples estadísticas, considera usar Collectors.teeing() (Java
        // 12+)
        // SOLUTION START
        throw new UnsupportedOperationException("Implement this method");
        // SOLUTION END
    }

    private static Stats toStats(IntSummaryStatistics s) {
        long count = s.getCount();
        if (count == 0) {
            return new Stats(0L, 0.0, 0, 0);
        }
        return new Stats(count, s.getAverage(), s.getMin(), s.getMax());
    }
}
