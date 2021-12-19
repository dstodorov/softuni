package SoftUni.basics.conditionalStatements.exercises;

import java.util.Scanner;

public class P05GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        float dressCost = Float.parseFloat(scanner.nextLine());

        double decor = budget * 0.1;
        boolean discount = actors > 150;
        if (discount) dressCost *= 0.9;

        double totalDressCost = actors * dressCost;
        if (decor + totalDressCost > budget) {
            double moneyNeeded = (decor + totalDressCost) - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.02f leva more.", moneyNeeded);
        } else {
            double moneyLeft = budget - (decor + totalDressCost);
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.02f leva left.", moneyLeft);
        }

    }
}
