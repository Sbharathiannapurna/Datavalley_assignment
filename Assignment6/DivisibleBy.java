package Assignment6;
import java.util.Scanner;
public class DivisibleBy {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (number % 7 == 0 && number % 13 == 0) {
	            System.out.println(number + " is divisible by 7 and 13.");
	            System.out.println("Quotient when divided by 7: " + (number / 7));
	            System.out.println("Remainder when divided by 7: " + (number % 7));
	            System.out.println("Quotient when divided by 13: " + (number / 13));
	            System.out.println("Remainder when divided by 13: " + (number % 13));
	        } else {
	            System.out.println(number + " is not divisible by both 7 and 13.");
	        }

	        scanner.close();
	    }
	}


