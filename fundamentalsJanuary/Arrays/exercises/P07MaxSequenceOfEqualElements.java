package SoftUni.fundamentalsJanuary.Arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxNumber = 0;
        int maxNumberCounter = 1;
        int prevNumber = 0;
        int counter = 0;

        for (int number : numbers) {
            if (number == prevNumber) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > maxNumberCounter) {
                maxNumberCounter = counter;
                maxNumber = number;
            }
            prevNumber = number;
        }

        for (int i = 0; i < maxNumberCounter; i ++) {
            System.out.print(maxNumber + " ");
        }
    }
}
