package SoftUni.fundamentalsJanuary.methods.lab;

import java.util.Scanner;

public class P05Orders {
    final double coffee = 1.5;
    final double water = 1;
    final double coke = 1.5;
    final double snacks = 1.5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        calculateTotalOrder(product, quantity);
    }

    private static void calculateTotalOrder(String product, int quantity) {
        double total = 0;

        if (product.equals("coffee")) {
            total = quantity * 1.5;
        } else if (product.equals("water")) {
            total = quantity * 1.0;
        } else if (product.equals("coke")) {
            total = quantity * 1.4;
        } else if (product.equals("snacks")) {
            total = quantity * 2.0;
        }
        System.out.printf("%.2f", total);
    }
}
