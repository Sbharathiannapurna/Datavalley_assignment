package Assignment7;
import java.util.HashMap;
import java.util.Map;
public class WeatherData {

	    public static void main(String[] args) {
	        double[] temperatures = {5, 15, 25, 10, 20, 10, 0, -5};
	        double[] humidity = {60, 70, 80, 75, 65, 70, 85, 90};

	        // Define temperature ranges
	        double[] temperatureRanges = {-Double.MAX_VALUE, 0, 10, 20, 30, Double.MAX_VALUE};

	        // Initialize counters for each temperature range
	        Map<String, Integer> countMap = new HashMap<>();
	        Map<String, Double> humiditySumMap = new HashMap<>();
	        for (int i = 0; i < temperatureRanges.length - 1; i++) {
	            String rangeKey = temperatureRanges[i] + "°C - " + temperatureRanges[i + 1] + "°C";
	            countMap.put(rangeKey, 0);
	            humiditySumMap.put(rangeKey, 0.0);
	        }

	        // Analyze weather data
	        for (int i = 0; i < temperatures.length; i++) {
	            double temperature = temperatures[i];
	            double hum = humidity[i];
	            for (int j = 0; j < temperatureRanges.length - 1; j++) {
	                if (temperature >= temperatureRanges[j] && temperature < temperatureRanges[j + 1]) {
	                    String rangeKey = temperatureRanges[j] + "°C - " + temperatureRanges[j + 1] + "°C";
	                    countMap.put(rangeKey, countMap.get(rangeKey) + 1);
	                    humiditySumMap.put(rangeKey, humiditySumMap.get(rangeKey) + hum);
	                    break;
	                }
	            }
	        }

	        // Display analysis results
	        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
	            String rangeKey = entry.getKey();
	            int count = entry.getValue();
	            double avgHumidity = humiditySumMap.get(rangeKey) / count;
	            System.out.println("Number of days with temperature in range " + rangeKey + ": " + count);
	            System.out.println("Average humidity for range " + rangeKey + ": " + avgHumidity);
	            System.out.println();
	        }
	    }
	
}
