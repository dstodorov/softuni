package SoftUni.basics.preExam;

import java.util.Scanner;

public class P02FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shirtPrice = Double.parseDouble(scanner.nextLine());
        double priceToReach = Double.parseDouble(scanner.nextLine());
        double shortsPrice = 0.75 * shirtPrice;
        double socksPrice = 0.2 * shortsPrice;
        double sneakersPrice = 2 * (shirtPrice + shortsPrice);
        double totalCost = shirtPrice + shortsPrice + socksPrice + sneakersPrice;
        double totalCostWithDiscount = totalCost - (totalCost * 0.15);

        if (totalCostWithDiscount >= priceToReach) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.%n", totalCostWithDiscount);

        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.%n", priceToReach - totalCostWithDiscount);
        }
    }
}
