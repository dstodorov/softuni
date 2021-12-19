package SoftUni.fundamentals.arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (numbers.length == 1) {
            System.out.println(0);
        } else {
            boolean haveEqualSums = false;
            for (int i = 0; i < numbers.length; i++) {
                int left = 0;
                int right = 0;
                for (int j = 0; j < i; j++) {
                    left += numbers[j];
                }
                for (int j = i + 1; j < numbers.length; j++) {
                    right += numbers[j];
                }
                if (left == right) {
                    System.out.println(i);
                    haveEqualSums = true;
                    break;
                }
            }
            if (!haveEqualSums) {
                System.out.println("no");
            }
        }
    }
}
