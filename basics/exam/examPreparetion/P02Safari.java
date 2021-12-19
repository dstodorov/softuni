package SoftUni.basics.exam.examPreparetion;

import java.util.Scanner;

public class P02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int additionalExpensesPercent = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (nights > 7) {
            pricePerNight -= pricePerNight * 0.05;
        }

        totalPrice = nights * pricePerNight;
        totalPrice = totalPrice + (budget * (1.0 * additionalExpensesPercent / 100));

        if (totalPrice <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalPrice);
        } else {
            System.out.printf("%.2f leva needed.", totalPrice - budget);
        }
    }
}
