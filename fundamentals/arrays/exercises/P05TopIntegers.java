package SoftUni.fundamentals.arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            boolean topFound = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    topFound = false;
                    break;
                }
            }
            if (topFound) output.append(numbers[i]).append(" ");
        }
        System.out.println(output);
    }
}
