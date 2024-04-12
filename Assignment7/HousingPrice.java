package Assignment7;
import java.util.HashMap;
import java.util.Map;
public class HousingPrice {
	
	    public static void main(String[] args) {
	        double[] prices = {150000, 220000, 180000, 250000, 300000, 350000, 400000};

	        // Define price ranges
	        double[] priceRanges = {100000, 200000, 300000, 400000, Double.MAX_VALUE};

	        // Initialize counters for each price range
	        Map<String, Integer> countMap = new HashMap<>();
	        Map<String, Double> areaSumMap = new HashMap<>();
	        for (int i = 0; i < priceRanges.length - 1; i++) {
	            String rangeKey = "$" + priceRanges[i] + "-" + priceRanges[i + 1];
	            countMap.put(rangeKey, 0);
	            areaSumMap.put(rangeKey, 0.0);
	        }

	        // Analyze housing prices
	        for (double price : prices) {
	            for (int i = 0; i < priceRanges.length - 1; i++) {
	                if (price >= priceRanges[i] && price < priceRanges[i + 1]) {
	                    String rangeKey = "$" + priceRanges[i] + "-" + priceRanges[i + 1];
	                    countMap.put(rangeKey, countMap.get(rangeKey) + 1);
	                    // Assuming each house has an associated square footage
	                    areaSumMap.put(rangeKey, areaSumMap.get(rangeKey) + 2000); // Assuming an average area of 2000 sq.ft.
	                    break;
	                }
	            }
	        }

	        // Display analysis results
	        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
	            String rangeKey = entry.getKey();
	            int count = entry.getValue();
	            double avgArea = areaSumMap.get(rangeKey) / count;
	            System.out.println("Number of houses sold in range " + rangeKey + ": " + count);
	            System.out.println("Average square footage for range " + rangeKey + ": " + avgArea);
	            System.out.println();
	        }
	    }
	}


