package SoftUni.basics.conditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String type = "";
        double price = 0;

        if (budget <= 1000) {
            type = "Camp";
            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.65;
            }
            if (season.equals("Winter")) {
                location = "Morocco";
                price = budget * 0.45;
            }
        }
        if (budget > 1000 && budget <= 3000) {
            type = "Hut";
            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.8;
            }
            if (season.equals("Winter")) {
                location = "Morocco";
                price = budget * 0.6;
            }
        }
        if (budget > 3000) {
            type = "Hotel";
            if (season.equals("Summer")) {
                location = "Alaska";
            }
            if (season.equals("Winter")) {
                location = "Morocco";
            }
            price = budget * 0.9;
        }

        System.out.printf("%s - %s - %.2f", location, type, price);
    }
}
