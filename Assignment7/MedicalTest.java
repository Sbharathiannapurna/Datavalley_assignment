package Assignment7;
import java.util.HashMap;
import java.util.Map;
public class MedicalTest {
	
	    public static void main(String[] args) {
	        String[] results = {"Normal", "Borderline", "High", "Normal", "High", "Borderline", "Normal"};

	        // Define result ranges
	        String[] resultRanges = {"Normal", "Borderline", "High"};

	        // Initialize counters for each result range
	        Map<String, Integer> countMap = new HashMap<>();
	        Map<String, Double> valueSumMap = new HashMap<>();
	        for (String range : resultRanges) {
	            countMap.put(range, 0);
	            valueSumMap.put(range, 0.0);
	        }

	        // Analyze medical test results
	        for (String result : results) {
	            countMap.put(result, countMap.get(result) + 1);
	        }

	        // Display analysis results
	        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
	            String rangeKey = entry.getKey();
	            int count = entry.getValue();
	            double avgValue = valueSumMap.get(rangeKey) / count; // Assuming there's a value associated with each result
	            System.out.println("Number of patients with result " + rangeKey + ": " + count);
	            System.out.println("Average value for result " + rangeKey + ": " + avgValue);
	            System.out.println();
	        }
	    }
	}


