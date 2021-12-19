package SoftUni.basics.nestedLoops.moreExercises;

import java.util.Scanner;

public class P08SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxHundreds = Integer.parseInt(scanner.nextLine());
        int maxTens = Integer.parseInt(scanner.nextLine());
        int maxOnes = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= maxHundreds; i++) {
            for (int j = 2; j <= maxTens; j++) {
                boolean isPrime = true;
                for (int ii = 2; ii <= j - 1; ii++) {
                    if (j % ii == 0) isPrime = false;
                }
                for (int k = 1; k <= maxOnes; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && isPrime) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
