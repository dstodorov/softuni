package SoftUni.fundamentalsJanuary.methods.exercises;

import java.util.Scanner;

public class P11TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        findTopIntegers(number);

    }

    private static void findTopIntegers(int n) {

        for (int number = 1; number <= n; number++) {
            boolean isNumbersDivisibleBy8 = digitsSumDivisibleBy8(number);
            int oddDigits = countOddDigits(number);
            if (isNumbersDivisibleBy8 && oddDigits >= 1) System.out.println(number);
        }



    }

    private static int countOddDigits(int n) {
        int count = 0;
        int number = n;

        while (number > 0) {
            if (number % 2 != 0) count++;
            number /= 10;
        }

        return count;
    }

    private static boolean digitsSumDivisibleBy8(int n) {
        int sum = 0;
        int number = n;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum % 8 == 0;
    }
}
