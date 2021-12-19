package SoftUni.fundamentals.arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[lines];
        int[] secondArray = new int[lines];

        for (int i = 0; i < lines; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                secondArray[i] = numbers[1];
                firstArray[i] = numbers[0];
            } else {
                secondArray[i] = numbers[0];
                firstArray[i] = numbers[1];
            }

        }
        for (int number : firstArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
    }
}
