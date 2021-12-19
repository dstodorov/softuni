package SoftUni.fundamentals.arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArrayOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbersArrayTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean identical = true;

        for (int i = 0; i <= numbersArrayOne.length - 1; i++) {
            sum += numbersArrayOne[i];
            if (numbersArrayOne[i] != numbersArrayTwo[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                identical = false;
                break;
            }
        }
        if (identical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
