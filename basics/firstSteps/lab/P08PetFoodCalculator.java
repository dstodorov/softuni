package SoftUni.basics.firstSteps.lab;

import java.util.Scanner;

public class P08PetFoodCalculator {
    public static void main(String[] args) {
        float CAT_FOOD_PRICE = 4;
        float DOG_FOOD_PRICE = 2.5f;

        Scanner scanner = new Scanner(System.in);

        int dogPacks = Integer.parseInt(scanner.nextLine());
        int catPacks = Integer.parseInt(scanner.nextLine());

        System.out.println(dogPacks * DOG_FOOD_PRICE + catPacks * CAT_FOOD_PRICE + " lv.");
    }
}
