package SoftUni.basics.nestedLoops.exercises;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int currentNumber = 0;

        if (n2 > n1 && n1 >= 100000 && n2 <= 300000) {
            for (int i = n1; i <= n2; i++) {
                currentNumber = i;
                int sumEvens = 0;
                int sumOdds = 0;
                for (int j = 1; j <= 6; j++) {
                    if (j % 2 == 0) {
                        sumEvens += currentNumber % 10;
                    } else {
                        sumOdds += currentNumber % 10;
                    }
                    currentNumber /= 10;
                }
                if (sumEvens == sumOdds) System.out.print(i + " ");
            }

        }
    }
}
