package SoftUni.basics.forLoop.moreExercises;

import java.util.Scanner;

public class P11OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double evenSum = 0.0;
        double oddSum = 0.0;
        double evenMin = 0;
        double evenMax = 0;
        double oddMin = 0;
        double oddMax = 0;
        int numbers = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numbers; i++) {
            double n = Double.parseDouble(scanner.nextLine());
            if (i == 1) {
                oddMin = n;
                oddMax = n;
            }
            if (i == 2) {
                evenMin = n;
                evenMax = n;
            }
            if (i % 2 == 0) {
                evenSum += n;
                if (n > evenMax) evenMax = n;
                if (n < evenMin) evenMin = n;
            } else {
                oddSum += n;
                if (n > oddMax) oddMax = n;
                if (n < oddMin) oddMin = n;
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddMax > 0 || oddMax < 0) {
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        } else {
            System.out.printf("OddMin=No,%n");
            System.out.printf("OddMax=No,%n");
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenMax > 0 || evenMax < 0) {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f%n", evenMax);
        } else {
            System.out.printf("EvenMin=No,%n");
            System.out.printf("EvenMax=No%n");
        }
    }
}
