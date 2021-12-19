package SoftUni.fundamentals.arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            int firstNumber = numbers[0];
            for (int j = 0; j < numbers.length; j++) {
                if (j == numbers.length - 1) {
                    numbers[numbers.length - 1] = firstNumber;
                } else {
                    numbers[j] = numbers[j + 1];
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
