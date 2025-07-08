package orchestrator;
public class Orchestrator {
    public static void executeHealingAction(String action) {
        switch (action) {
            case "Scale Service":
                System.out.println("[ACTION] Scaling the service using Kubernetes API");
                break;
            case "Reroute Traffic":
                System.out.println("[ACTION] Rerouting traffic to healthy instance");
                break;
            default:
                System.out.println("[INFO] System is healthy. No action required.");
        }
    }
}
