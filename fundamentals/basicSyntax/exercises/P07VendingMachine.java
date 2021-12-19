package SoftUni.fundamentals.basicSyntax.exercises;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double NUTS_PRICE = 2.0;
        double WATER_PRICE = 0.7;
        double CRISPS_PRICE = 1.5;
        double SODA_PRICE = 0.8;
        double COKE_PRICE = 1.0;

        String input = scanner.nextLine();
        double totalCoinsInserted = 0;


        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            boolean accepted = coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2;
            if (accepted) {
                totalCoinsInserted += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }

        while (!input.equals("End")) {
            if (!input.equals("Start")) {
                switch (input) {
                    case "Nuts":
                        if (totalCoinsInserted >= NUTS_PRICE) {
                            totalCoinsInserted -= NUTS_PRICE;
                            System.out.printf("Purchased %s%n", input);
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Water":
                        if (totalCoinsInserted >= WATER_PRICE) {
                            totalCoinsInserted -= WATER_PRICE;
                            System.out.printf("Purchased %s%n", input);
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Crisps":
                        if (totalCoinsInserted >= CRISPS_PRICE) {
                            totalCoinsInserted -= CRISPS_PRICE;
                            System.out.printf("Purchased %s%n", input);
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Soda":
                        if (totalCoinsInserted >= SODA_PRICE) {
                            totalCoinsInserted -= SODA_PRICE;
                            System.out.printf("Purchased %s%n", input);
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Coke":
                        if (totalCoinsInserted >= COKE_PRICE) {
                            totalCoinsInserted -= COKE_PRICE;
                            System.out.printf("Purchased %s%n", input);
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    default:
                        System.out.println("Invalid product");
                        break;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalCoinsInserted);
    }
}
