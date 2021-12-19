package SoftUni.fundamentals.arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxCount = 0;
        int maxCountDigit = 0;

        for (int i = 0; i < numbers.length; i++) {
            int currentDigit = numbers[i];
            int count = 1;
            int sameDigit = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentDigit == numbers[j]) {
                    sameDigit = numbers[j];
                    count++;
                } else {
                    currentDigit = numbers[j];
                    count = 1;
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxCountDigit = sameDigit;
                }
            }
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(maxCountDigit + " ");
        }
    }
}
