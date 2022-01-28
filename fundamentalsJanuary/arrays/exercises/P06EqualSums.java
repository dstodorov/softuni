package SoftUni.fundamentalsJanuary.arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean found = false;
        if (numbers.length > 1) {
            for (int i = 0; i < numbers.length; i++) {
                int sumLeft = 0;
                int sumRight = 0;
                for (int j = 0; j < i; j++) {
                    sumLeft += numbers[j];
                }
                for (int j = i + 1; j < numbers.length; j++) {
                    sumRight += numbers[j];
                }

                if (sumLeft == sumRight) {
                    System.out.print(i);
                    found = true;
                    break;
                }
            }
        } else {
            System.out.println(0);
        }
        if (!found && numbers.length > 1) {
            System.out.println("no");
        }
    }
}
