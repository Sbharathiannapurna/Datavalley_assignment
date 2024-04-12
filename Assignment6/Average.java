package Assignment6;
import java.util.Scanner;
public class Average {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int largest = Integer.MIN_VALUE;
	        int smallest = Integer.MAX_VALUE;
	        int sum = 0;
	        int count = 0;

	        while (true) {
	            System.out.print("Enter a number (or type 'done' to finish): ");
	            String input = scanner.nextLine();

	            if (input.equalsIgnoreCase("done")) {
	                break;
	            }

	            int number = Integer.parseInt(input);
	            largest = Math.max(largest, number);
	            smallest = Math.min(smallest, number);
	            sum += number;
	            count++;
	        }

	        if (count == 0) {
	            System.out.println("No numbers entered.");
	        } else {
	            double average = (double) sum / count;
	            System.out.println("Largest number: " + largest);
	            System.out.println("Smallest number: " + smallest);
	            System.out.println("Average: " + average);
	        }

	        scanner.close();
	    }
	}


