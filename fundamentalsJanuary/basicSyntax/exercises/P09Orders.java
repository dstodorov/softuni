package SoftUni.fundamentalsJanuary.basicSyntax.exercises;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 0; i < ordersCount; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double totalPrice = ((daysInMonth * capsulesCount) * pricePerCapsule);
            total += totalPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", totalPrice);
        }
        System.out.printf("Total: $%.2f", total);
    }
}
