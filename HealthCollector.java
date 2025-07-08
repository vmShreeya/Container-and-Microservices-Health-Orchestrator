package monitor;
import java.util.Map;
public class HealthCollector {
    public static Map<String, Integer> collectHealthData() {
        return MetricsFetcher.fetchMetrics();
    }
}
