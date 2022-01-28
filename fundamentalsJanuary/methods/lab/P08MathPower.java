package SoftUni.fundamentalsJanuary.methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        String formattedResult = new DecimalFormat("0.####").format(mathPower(number, power));
        System.out.println(formattedResult);
    }

    private static double mathPower(double number, int power) {
        double result = 1;

        for (int i = 0; i < power; i++) {
            result *= number;
        }

        return result;
    }
}
