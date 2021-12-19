package SoftUni.basics.conditionalStatements.moreExercises;

import java.util.Scanner;

public class P06Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysLeft = Integer.parseInt(scanner.nextLine());
        int foodLeftKg = Integer.parseInt(scanner.nextLine());
        double dogFoodKg = Double.parseDouble(scanner.nextLine());
        double catFoodKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodKg = Double.parseDouble(scanner.nextLine());

        double foodNeededKg = (dogFoodKg + catFoodKg + (turtleFoodKg/1000)) * daysLeft;

        if (foodLeftKg >= foodNeededKg) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeftKg - foodNeededKg));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodNeededKg - foodLeftKg));
        }
    }
}
