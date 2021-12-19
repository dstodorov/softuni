package SoftUni.fundamentals.arrays.lab;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[totalNumbers];

        for (int i = 0; i <= numbers.length-1; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
}
