package SoftUni.fundamentals.basicSyntax.lab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int oddNumbersSum = 0;
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            oddNumbersSum += counter;
            System.out.println(counter);
            counter += 2;
        }
        System.out.println("Sum: " + oddNumbersSum);
    }
}
