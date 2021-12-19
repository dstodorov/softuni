package SoftUni.basics.exam.examPreparetion;

import java.util.Scanner;

public class P02FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalAmountFood = Double.parseDouble(scanner.nextLine());

        int catTotalFood = 0;
        int dogTotalFood = 0;
        double biscuitAmount = 0;
        int foodEaten = 0;


        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            catTotalFood += catFood;
            dogTotalFood += dogFood;

            foodEaten += catFood + dogFood;

            if (i % 3 == 0) {
                biscuitAmount += 0.1 * (catFood + dogFood);
            }
        }

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuitAmount));
        System.out.printf("%.2f%% of the food has been eaten.%n", foodEaten / totalAmountFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", 1.0 * dogTotalFood / foodEaten * 100);
        System.out.printf("%.2f%% eaten from the cat.", 1.0 * catTotalFood / foodEaten * 100);
    }
}
