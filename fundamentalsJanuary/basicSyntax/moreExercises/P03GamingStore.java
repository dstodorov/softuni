package SoftUni.fundamentalsJanuary.basicSyntax.moreExercises;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        double originalBalance = currentBalance;
        String input = scanner.nextLine();

        double totalCost = 0;

        while (!input.equals("Game Time")) {
            String game = input;
            if (game.equals("OutFall 4")) {
                if (haveMoney(currentBalance, 39.99)) {
                    currentBalance -= 39.99;
                    totalCost += 39.99;
                    System.out.printf("Bought %s%n", game);
                }
            } else if (game.equals("CS: OG")) {
                if (haveMoney(currentBalance, 15.99)) {
                    currentBalance -= 15.99;
                    totalCost += 15.99;
                    System.out.printf("Bought %s%n", game);
                }
            } else if (game.equals("Zplinter Zell")) {
                if (haveMoney(currentBalance, 19.99)) {
                    currentBalance -= 19.99;
                    totalCost += 19.99;
                    System.out.printf("Bought %s%n", game);
                }
            } else if (game.equals("Honored 2")) {
                if (haveMoney(currentBalance, 59.99)){
                    currentBalance -= 59.99;
                    totalCost += 59.99;
                    System.out.printf("Bought %s%n", game);
                }
            } else if (game.equals("RoverWatch")) {
                if (haveMoney(currentBalance, 29.99)){
                    currentBalance -= 29.99;
                    totalCost += 29.99;
                    System.out.printf("Bought %s%n", game);
                }
            } else if (game.equals("RoverWatch Origins Edition")) {
                if (haveMoney(currentBalance, 39.99)) {
                    currentBalance -= 39.99;
                    totalCost += 39.99;
                    System.out.printf("Bought %s%n", game);
                }
            } else {
                System.out.println("Not Found");
            }

            if (currentBalance == 0) {
                System.out.println("Out of money!");
                break;
            }
            input = scanner.nextLine();
        }
        if (currentBalance != 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalCost, originalBalance - totalCost);
        }
    }

    private static boolean haveMoney(double currentBalance, double gamePrice) {
        if (currentBalance < gamePrice) {
            System.out.println("Too Expensive");
            return false;
        } else {
            return true;
        }
    }
}
