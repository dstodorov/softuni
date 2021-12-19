package SoftUni.basics.whileLoop.lab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        double total = 0;

        while (true) {
            text = scanner.nextLine();
            if (!text.equals("NoMoreMoney")) {
                if (Double.parseDouble(text) >= 0) {
                    System.out.printf("Increase: %.2f%n", Double.parseDouble(text));
                    total += Double.parseDouble(text);
                } else {
                    System.out.println("Invalid operation!");
                    break;
                }
            } else {
                break;
            }
        }
        System.out.printf("Total: %.2f", total);
    }
}
