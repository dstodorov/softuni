package SoftUni.basics.firstSteps.moreExercises;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {

        double EUR = 1.94;

        Scanner scanner = new Scanner(System.in);

        double veggiePricePerKG = Double.parseDouble(scanner.nextLine());
        double fruitPricePerKG = Double.parseDouble(scanner.nextLine());
        int veggies = Integer.parseInt(scanner.nextLine());
        int fruits = Integer.parseInt(scanner.nextLine());

        double totalCostInEUR = ((veggies * veggiePricePerKG) + (fruits * fruitPricePerKG)) / EUR;

        System.out.printf("%.2f", totalCostInEUR);

    }
}
