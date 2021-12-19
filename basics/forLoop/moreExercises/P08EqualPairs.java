package SoftUni.basics.forLoop.moreExercises;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int value = 0;
        int maxDiff = 0;

        for (int i = 0; i < n; i++) {
            int n1 = Integer.parseInt(scanner.nextLine());
            int n2 = Integer.parseInt(scanner.nextLine());
            int sum = n1 + n2;
            if (i == 0) value = sum;
            else {
                if (value != sum) {
                    int currentDiff = Math.abs(sum - value);
                    if (currentDiff > maxDiff) maxDiff = currentDiff;
                    value = sum;
                }
            }
        }
        if (maxDiff > 0) {
            System.out.printf("No, maxdiff=%d%n", maxDiff);
        } else {
            System.out.printf("Yes, value=%d%n", value);
        }
    }
}
