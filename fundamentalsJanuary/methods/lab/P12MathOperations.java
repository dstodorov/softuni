package SoftUni.fundamentalsJanuary.methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P12MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOne = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double numberTwo = Double.parseDouble(scanner.nextLine());

        double result = calculate(numberOne, operator, numberTwo);
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println(df.format(result));
    }

    private static double calculate(double numberOne, String operator, double numberTwo) {
        double result = 0;

        switch (operator) {
            case "*" :
                result = multiply(numberOne, numberTwo);
                break;
            case "/" :
                result = divide(numberOne, numberTwo);
                break;
            case "+" :
                result = sum(numberOne, numberTwo);
                break;
            case "-" :
                result = subtract(numberOne, numberTwo);
                break;
        }

        return result;
    }

    private static double subtract(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    private static double sum(double numberOne, double numberTwo) {
        return  numberOne + numberTwo;
    }

    private static double divide(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

    private static double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }
}
