package models;
import java.util.Map;
public class FailurePredictor {
    public static String predictFailure(Map<String, Integer> metrics) {
        if (metrics.get("cpu") > 90 || metrics.get("latency") > 1000) {
            return "High Risk";
        }
        return "Healthy";
    }
}
