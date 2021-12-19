package SoftUni.fundamentals.basicSyntax.exercises;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum: " + sum);
    }
}
