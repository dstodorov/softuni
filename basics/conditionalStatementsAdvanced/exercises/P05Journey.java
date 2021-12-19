package SoftUni.basics.conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double spend = 0;
        String place = "";
        String placeType = "";

        if (budget <= 100) {
            place = "Bulgaria";
            if (season.equals("summer")) {
                spend = budget * 0.3;
                placeType = "Camp";
            }
            if (season.equals("winter")) {
                spend = budget * 0.7;
                placeType = "Hotel";
            }
        }
        if (budget > 100 && budget <= 1000) {
            place = "Balkans";
            if (season.equals("summer")) {
                placeType = "Camp";
                spend = budget * 0.4;
            }
            if (season.equals("winter")) {
                spend = budget * 0.8;
                placeType = "Hotel";
            }
        }
        if (budget > 1000) {
            place = "Europe";
            spend = budget * 0.9;
            placeType = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", place);
        System.out.printf("%s - %.2f", placeType, spend);
    }
}