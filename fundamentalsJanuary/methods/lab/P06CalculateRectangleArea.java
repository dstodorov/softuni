package SoftUni.fundamentalsJanuary.methods.lab;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double rectArea = calcRectangleArea(a, b);
        System.out.printf("%.0f", rectArea);
    }

    private static double calcRectangleArea(double a, double b) {
        return a * b;
    }
}
