package monitor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class MetricsFetcher {
    public static Map<String, Integer> fetchMetrics() {
        String csvFile = "health_metrics.csv";  // Make sure this file is in your project root
        String line;
        String cvsSplitBy = ",";
        Random rand = new Random();
        List<Map<String, Integer>> dataset = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                if (data.length < 3) continue;
                Map<String, Integer> row = new HashMap<>();
                row.put("cpu", Integer.parseInt(data[0].trim()));
                row.put("memory", Integer.parseInt(data[1].trim()));
                row.put("latency", Integer.parseInt(data[2].trim()));
                dataset.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataset.isEmpty() ? Collections.emptyMap() : dataset.get(rand.nextInt(dataset.size()));
    }
}
