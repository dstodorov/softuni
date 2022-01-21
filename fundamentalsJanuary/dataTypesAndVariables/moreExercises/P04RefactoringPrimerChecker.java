package SoftUni.fundamentalsJanuary.dataTypesAndVariables.moreExercises;

import java.util.Scanner;

public class P04RefactoringPrimerChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int digit = 2; digit < i; digit++) {
                if (i % digit == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }
    }
}
