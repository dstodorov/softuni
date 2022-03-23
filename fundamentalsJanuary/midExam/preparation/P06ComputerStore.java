package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.Scanner;

public class P06ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalAmount = 0;
        double totalTaxes = 0;
        double totalAmountWithoutTaxes = 0;
        while (!input.equals("special") && !input.equals("regular")) {
            double partPrice = Double.parseDouble(input);

            if (partPrice >= 0) {
                totalAmount += partPrice * 1.2;
                totalTaxes += partPrice * 0.2;
                totalAmountWithoutTaxes += partPrice;
            } else {
                System.out.println("Invalid price!");
            }

            input = scanner.nextLine();
        }

        if (input.equals("special")) totalAmount *= 0.9;

        if (totalAmount == 0) System.out.println("Invalid order!");
        else {
            System.out.printf("Congratulations you've just bought a new computer!%n");
            System.out.printf("Price without taxes: %.2f$%n", totalAmountWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", totalTaxes);
            System.out.printf("-----------%n");
            System.out.printf("Total price: %.2f$%n", totalAmount);
        }
    }
}

