package Assignment6;

import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses = quantity * pricePerItem;

        double discount = 0;
        if (quantity > 50) {
            discount = totalExpenses * 0.10;
        } else if (quantity >= 25 && quantity <= 50) {
            discount = totalExpenses * 0.05;
        }

        double finalAmount = totalExpenses - discount;
        System.out.println("Total expenses after discount: Rs. " + finalAmount);

        scanner.close();
    }
}

