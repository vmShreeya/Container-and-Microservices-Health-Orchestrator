package orchestrator;
import java.util.Map;
public class HealingEngine {
    public static String decideHealingAction(String prediction, Map<String, Integer> metrics) {
        if ("High Risk".equals(prediction)) {
            if (metrics.get("cpu") > 90) {
                return "Scale Service";
            } else if (metrics.get("latency") > 1000) {
                return "Reroute Traffic";
            }
        }
        return "No Action";
    }
}
