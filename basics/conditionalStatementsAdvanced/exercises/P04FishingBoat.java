package SoftUni.basics.conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double discount = 0.0;

        int boatPrice = 0;

        if (season.equals("Spring")) {
            boatPrice = 3000;
        }
        if (season.equals("Summer") || season.equals("Autumn")) {
            boatPrice = 4200;
        }

        if (season.equals("Winter")) {
            boatPrice = 2600;
        }

        if (fishermen <= 6) {
            discount = 0.1;
        }
        if (fishermen >= 7 && fishermen <= 11) {
            discount = 0.15;
        }
        if (fishermen >= 12) {
            discount = 0.25;
        }
        double totalCost = boatPrice - (boatPrice * discount);

        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            totalCost -= totalCost * 0.05;
        }

        if (totalCost <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalCost);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalCost - budget);
        }
    }
}
