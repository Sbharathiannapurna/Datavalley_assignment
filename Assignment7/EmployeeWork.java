package Assignment7;
import java.util.HashMap;
import java.util.Map;
public class EmployeeWork {
	    public static void main(String[] args) {
	        int[] workHours = {35, 40, 45, 50, 55, 30, 40, 38, 42, 39};

	        // Initialize counters
	        int moreThan40Count = 0;
	        int equalTo40Count = 0;
	        int lessThan40Count = 0;
	        int totalHours = 0;

	        // Analyze work hours
	        for (int hours : workHours) {
	            totalHours += hours;
	            if (hours > 40) {
	                moreThan40Count++;
	            } else if (hours == 40) {
	                equalTo40Count++;
	            } else {
	                lessThan40Count++;
	            }
	        }

	        // Calculate average hours worked per day for each group
	        double moreThan40Avg = (double) totalHours / moreThan40Count;
	        double equalTo40Avg = (double) totalHours / equalTo40Count;
	        double lessThan40Avg = (double) totalHours / lessThan40Count;

	        // Display analysis results
	        System.out.println("Number of employees who worked more than 40 hours: " + moreThan40Count);
	        System.out.println("Average hours worked per day: " + moreThan40Avg);
	        System.out.println();
	        System.out.println("Number of employees who worked exactly 40 hours: " + equalTo40Count);
	        System.out.println("Average hours worked per day: " + equalTo40Avg);
	        System.out.println();
	        System.out.println("Number of employees who worked less than 40 hours: " + lessThan40Count);
	        System.out.println("Average hours worked per day: " + lessThan40Avg);
	    }
	

}
