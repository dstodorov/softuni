package SoftUni.fundamentalsJanuary.basicSyntax.exercises;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double wallet = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                wallet += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {
            String product = input;
            if (product.equals("Nuts")) {
                if (haveMoney(wallet, 2.0)) {
                    wallet = purchaseProduct(product, wallet, 2.0);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Water")) {
                if (haveMoney(wallet, 0.7)) {
                    wallet = purchaseProduct(product, wallet, 0.7);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Crisps")) {
                if (haveMoney(wallet, 1.5)) {
                    wallet = purchaseProduct(product, wallet, 1.5);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Soda")) {
                if (haveMoney(wallet, 0.8)) {
                    wallet = purchaseProduct(product, wallet, 0.8);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Coke")) {
                if (haveMoney(wallet, 1.0)) {
                    wallet = purchaseProduct(product, wallet, 1.0);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", wallet);
    }

    private static double purchaseProduct(String product, double wallet, double price) {
        System.out.printf("Purchased %s%n", product);
        return wallet - price;
    }

    private static boolean haveMoney(double wallet, double price) {
        return wallet >= price;
    }
}
