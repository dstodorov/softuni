package SoftUni.advancedMay.advanced.functionalProgramming.lab;

import java.util.Scanner;
import java.util.function.BiFunction;

public class P02SumNumberBiFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(",\\s");

        System.out.println("Count = " + numbers.length);

        BiFunction<Integer, String, Integer> parseAndSum = (x, y) -> x + Integer.parseInt(y);
        int sum = 0;

        for (String number : numbers) {
            sum = parseAndSum.apply(sum, number);
        }

        System.out.println("Sum = " + sum);


    }
}
