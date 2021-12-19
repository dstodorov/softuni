package SoftUni.basics.conditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());
        double pricePerKm = 0;
        double cost = 0;

        if (season.equals("Spring") || season.equals("Autumn")) {
            if (kmPerMonth <= 5000) {
                pricePerKm = 0.75;
            }
            if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                pricePerKm = 0.95;
            }
        }
        if (season.equals("Summer")) {
            if (kmPerMonth <= 5000) {
                pricePerKm = 0.9;
            }
            if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                pricePerKm = 1.1;
            }
        }
        if (season.equals("Winter")) {
            if (kmPerMonth <= 5000) {
                pricePerKm = 1.05;
            }
            if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                pricePerKm = 1.25;
            }
        }
        if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
            pricePerKm = 1.45;
        }

        cost = kmPerMonth * 4 * pricePerKm;
        cost -= cost * 0.1;

        System.out.printf("%.2f", cost);

    }
}
