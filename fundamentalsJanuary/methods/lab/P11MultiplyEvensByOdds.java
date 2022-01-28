package SoftUni.fundamentalsJanuary.methods.lab;

import java.util.Scanner;

public class P11MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        int result = getMultipleOfEvensAndOdds(number);
        System.out.println(result);
    }

    private static int getMultipleOfEvensAndOdds(int number) {
        int evensSum = getSumOfOddDigits(number);
        int oddsSum = getSumOfEvenDigits(number);

        return evensSum * oddsSum;
    }

    private static int getSumOfOddDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;

            if (digit % 2 != 0) {
                sum += digit;
            }

            number /= 10;
        }
        return sum;
    }

    private static int getSumOfEvenDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }

            number /= 10;
        }
        return sum;
    }
}


