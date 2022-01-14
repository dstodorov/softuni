package SoftUni.fundamentalsJanuary.basicSyntax.exercises;

import java.util.Scanner;

public class P02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int topDivider = 0;

        if (number % 2 == 0) {
            topDivider = 2;
        }
        if (number % 3 == 0) {
            topDivider = 3;

        }
        if (number % 6 == 0) {
            topDivider = 6;

        }
        if (number % 7 == 0) {
            topDivider = 7;

        }
        if (number % 10 == 0) {
            topDivider = 10;
        }

        if (topDivider != 0) {
            System.out.printf("The number is divisible by %d%n", topDivider);
        } else {
            System.out.println("Not divisible");
        }
    }
}
