package Assignment6;
import java.util.Scanner;
public class LibraryFine {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of days late: ");
	        int daysLate = scanner.nextInt();

	        double fine = 0;
	        if (daysLate >= 1 && daysLate <= 7) {
	            fine = daysLate * 0.5;
	        } else if (daysLate >= 8 && daysLate <= 14) {
	            fine = daysLate * 1;
	        } else if (daysLate > 14 && daysLate <= 21) {
	            fine = 5;
	        } else if (daysLate > 21) {
	            System.out.println("Your membership has been canceled due to late return.");
	            System.exit(0);
	        }

	        System.out.println("Fine: Rs. " + fine);

	        scanner.close();
	    }
	}


