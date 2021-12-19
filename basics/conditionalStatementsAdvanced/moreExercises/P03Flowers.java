package SoftUni.basics.conditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chrysanthemumsPrice = 0.0;
        double rosesPrice = 0.0;
        double tulipsPrice = 0.0;
        double discount = 0.0;

        if (season.equals("Spring") || season.equals("Summer")) {
            chrysanthemumsPrice = 2.0;
            rosesPrice = 4.1;
            tulipsPrice = 2.5;
        }
        if (season.equals("Autumn") || season.equals("Winter")) {
            chrysanthemumsPrice = 3.75;
            rosesPrice = 4.5;
            tulipsPrice = 4.15;
        }
        double totalCost = (chrysanthemums * chrysanthemumsPrice + roses * rosesPrice + tulips * tulipsPrice);

        if (holiday.equals("Y")) {
            totalCost *= 1.15;
        }


        if (tulips > 7 && season.equals("Spring")) {
            discount = 0.05;
            totalCost -= totalCost * discount;
        }
        if (roses >= 10 && season.equals("Winter")) {
            discount = 0.1;
            totalCost -= totalCost * discount;
        }
        if (chrysanthemums + roses + tulips > 20) {
            discount = 0.2;
            totalCost -= totalCost * discount;
        }

        totalCost += 2;
        System.out.printf("%.2f", totalCost);

    }
}
