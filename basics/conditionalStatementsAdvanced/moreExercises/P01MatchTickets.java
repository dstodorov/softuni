package SoftUni.basics.conditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        double transport = 0.0;
        double totalCost = 0.0;

        if (numberOfPeople >= 1 && numberOfPeople <= 4) transport = 0.75 * budget;
        if (numberOfPeople >= 5 && numberOfPeople <= 9) transport = 0.6 * budget;
        if (numberOfPeople >= 10 && numberOfPeople <= 24) transport = 0.5 * budget;
        if (numberOfPeople >= 25 && numberOfPeople <= 49) transport = 0.4 * budget;
        if (numberOfPeople >= 50) transport = 0.25 * budget;

        if (category.equals("VIP")) {
            totalCost = (numberOfPeople * 499.99) + transport;
        }
        if (category.equals("Normal")) {
            totalCost = (numberOfPeople * 249.99) + transport;
        }

        if (budget >= totalCost) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalCost);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalCost - budget);
        }
    }
}
