package SoftUni.fundamentalsJanuary.methods.exercises;

import java.util.Scanner;

public class P09FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        double factNumberOne = calculateFactorial(numberOne);
        double factNumberTwo = calculateFactorial(numberTwo);
        double result = divide(factNumberOne, factNumberTwo);

        System.out.printf("%.2f", result);
    }

    private static long  calculateFactorial(int number) {
        long  result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    private static double divide (double n1, double n2) {
        return n1 / n2;
    }
}
