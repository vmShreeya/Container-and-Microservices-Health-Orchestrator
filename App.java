package app;
import monitor.HealthCollector;
import models.FailurePredictor;
import orchestrator.HealingEngine;
import orchestrator.Orchestrator;
import java.util.Map;
public class App {
    public static void main(String[] args) {
        Map<String, Integer> metrics = HealthCollector.collectHealthData();
        String prediction = FailurePredictor.predictFailure(metrics);
        String action = HealingEngine.decideHealingAction(prediction, metrics);
        Orchestrator.executeHealingAction(action);
    }
}
