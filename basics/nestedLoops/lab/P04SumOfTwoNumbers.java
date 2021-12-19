package SoftUni.basics.nestedLoops.lab;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int totalCombinations = 0;
        boolean found = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                totalCombinations++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", totalCombinations, i, j, magicNumber);
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        if (!found) {
            System.out.printf("%d combinations - neither equals %d", totalCombinations, magicNumber);
        }
    }
}
