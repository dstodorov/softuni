package SoftUni.fundamentalsJanuary.methods.lab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());

        switch (operation) {
            case "add":
                add(n1, n2);
                break;
            case "multiply":
                multiply(n1, n2);
                break;
            case "subtract":
                subtract(n1, n2);
                break;
            case "divide":
                divide(n1, n2);
                break;
        }
    }

    private static void divide(double n1, double n2) {
        System.out.printf("%.0f", n1 / n2);
    }

    private static void subtract(double n1, double n2) {
        System.out.printf("%.0f", n1 - n2);
    }

    private static void multiply(double n1, double n2) {
        System.out.printf("%.0f", n1 * n2);
    }

    private static void add(double n1, double n2) {
        System.out.printf("%.0f", n1 + n2);
    }
}
