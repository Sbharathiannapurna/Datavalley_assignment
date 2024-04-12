package Assignment6;
import java.util.Scanner;
public class EmployeeBonus {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input current year
	        System.out.print("Enter the current year: ");
	        int currentYear = scanner.nextInt();

	        // Input year of joining
	        System.out.print("Enter the year of joining: ");
	        int yearOfJoining = scanner.nextInt();

	        // Calculate years of service
	        int yearsOfService = currentYear - yearOfJoining;

	        // Check if the employee is eligible for a bonus
	        if (yearsOfService > 5) {
	            System.out.println("Congratulations! You've been awarded a bonus of Rs. 5000/-");
	        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
	            System.out.println("Congratulations! You've been awarded a bonus of Rs. 3000/-");
	        } else {
	            System.out.println("Sorry, no bonus is awarded.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}


