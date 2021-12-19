package SoftUni.fundamentals.dataTypesAndVariables.lab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double GBP = 1.36;
        double pounds = Double.parseDouble(scanner.nextLine());
        double dollars = pounds * 1.36;
        System.out.printf("%.3f", dollars);
    }
}
