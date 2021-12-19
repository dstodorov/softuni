package SoftUni.basics.whileLoop.moreExercises;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moneyToSave = Integer.parseInt(scanner.nextLine());
        int savedMoney = 0;
        int i = 1;
        int cashPayments = 0;
        double totalCashPayments = 0;
        int cardPayments = 0;
        double totalCardPayments = 0;

        while (true) {
            String cost = scanner.nextLine();

            if (cost.equals("End")) {
                break;
            } else {
                if (i % 2 != 0) {
                    if (Integer.parseInt(cost) > 100) System.out.println("Error in transaction!");
                    else {
                        savedMoney += Integer.parseInt(cost);
                        System.out.println("Product sold!");
                        cashPayments++;
                        totalCashPayments += Integer.parseInt(cost);
                    }
                } else {
                    if (Integer.parseInt(cost) < 10) System.out.println("Error in transaction!");
                    else {
                        savedMoney += Integer.parseInt(cost);
                        System.out.println("Product sold!");
                        cardPayments++;
                        totalCardPayments += Integer.parseInt(cost);
                    }
                }

                if (savedMoney >= moneyToSave) {
                    System.out.printf("Average CS: %.2f%n", totalCashPayments / cashPayments);
                    System.out.printf("Average CC: %.2f%n", totalCardPayments / cardPayments);
                    break;
                }
                i++;
            }
        }
        if (moneyToSave > savedMoney) {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
