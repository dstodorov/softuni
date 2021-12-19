package SoftUni.basics.nestedLoops.moreExercises;

import java.util.Scanner;

public class P09SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinations = 0;
        boolean end = false;

        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= endNumber; j++) {
                combinations++;

                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinations, i, j, i + j);
                    end = true;
                    break;
                }
            }
            if (end) break;;
        }
        if (!end) System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);
    }
}
