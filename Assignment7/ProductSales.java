package Assignment7;
import java.util.HashMap;
import java.util.Map;

public class ProductSales {
	    public static void main(String[] args) {
	        double[] sales = {45.50, 75.25, 105.80, 30.50, 150.75, 80.25, 200.50};

	        // Define price ranges
	        double[] priceRanges = {0, 50, 100, 200, Double.MAX_VALUE};

	        // Initialize counters for each price range
	        Map<String, Integer> countMap = new HashMap<>();
	        Map<String, Double> revenueMap = new HashMap<>();
	        for (int i = 0; i < priceRanges.length - 1; i++) {
	            String rangeKey = "$" + priceRanges[i] + "-" + priceRanges[i + 1];
	            countMap.put(rangeKey, 0);
	            revenueMap.put(rangeKey, 0.0);
	        }

	        // Analyze sales data
	        for (double sale : sales) {
	            for (int i = 0; i < priceRanges.length - 1; i++) {
	                if (sale >= priceRanges[i] && sale < priceRanges[i + 1]) {
	                    String rangeKey = "$" + priceRanges[i] + "-" + priceRanges[i + 1];
	                    countMap.put(rangeKey, countMap.get(rangeKey) + 1);
	                    revenueMap.put(rangeKey, revenueMap.get(rangeKey) + sale);
	                    break;
	                }
	            }
	        }

	        // Display analysis results
	        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
	            String rangeKey = entry.getKey();
	            int count = entry.getValue();
	            double totalRevenue = revenueMap.get(rangeKey);
	            System.out.println("Number of products sold in range " + rangeKey + ": " + count);
	            System.out.println("Total revenue in range " + rangeKey + ": $" + totalRevenue);
	            System.out.println();
	        }
	    }
	}

