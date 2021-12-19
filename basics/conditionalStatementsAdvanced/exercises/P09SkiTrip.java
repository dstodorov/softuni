package SoftUni.basics.conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String score = scanner.nextLine();
        double discount = 0.0;
        double totalCost = 0.0;

        if (roomType.equals("room for one person")) {
            totalCost = (days - 1) * 18.00;
        }
        if (roomType.equals("apartment")) {
            if (days < 10) {
                discount = 0.3;
            }
            if (days >= 10 && days <= 15) {
                discount = 0.35;
            }
            if (days > 15) {
                discount = 0.5;
            }

            totalCost = (days - 1) * 25.00 - (((days - 1) * 25.00) * discount);
        }
        if (roomType.equals("president apartment")) {
            if (days < 10) {
                discount = 0.1;
            }
            if (days >= 10 && days <= 15) {
                discount = 0.15;
            }
            if (days > 15) {
                discount = 0.2;
            }
            totalCost = (days - 1) * 35.00 - (((days - 1) * 35.00) * discount);
        }

        if (score.equals("positive")) {
            totalCost *= 1.25;
        }
        if (score.equals("negative")) {
            totalCost *= 0.9;
        }

        System.out.printf("%.2f", totalCost);

    }
}
