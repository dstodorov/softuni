package SoftUni.basics.conditionalStatements.exercises;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        float PUZZLE_PRICE = 2.6f;
        float DOLL_PRICE = 3f;
        float BEAR_PRICE = 4.1f;
        float MINION_PRICE = 8.2f;
        float TRUCK_PRICE = 2f;

        Scanner scanner = new Scanner(System.in);

        float vacation = Float.parseFloat(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        float orderCost = (puzzles * PUZZLE_PRICE) + (dolls * DOLL_PRICE) + (bears * BEAR_PRICE) + (minions * MINION_PRICE) + (trucks * TRUCK_PRICE);

        boolean discount = puzzles + dolls + bears + minions + trucks >= 50;

        if (discount) {
            orderCost *= 0.75f;
        }

        orderCost *= 0.9f;

        if (orderCost >= vacation) {
            float lvLeft = orderCost - vacation;
            System.out.printf("Yes! %.2f lv left.", lvLeft);
        } else {
            float lvNeeded = vacation - orderCost;
            System.out.printf("Not enough money! %.2f lv needed.", lvNeeded);
        }
    }
}
