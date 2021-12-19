package SoftUni.basics.forLoop.lab;

import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int minNumber = 0;
        int maxNumber = 0;

        for (int i = 0; i < numbers; i++) {

            int number = Integer.parseInt(scanner.nextLine());
            if (i == 0) {
                minNumber = number;
                maxNumber = number;
            }
            if (number > maxNumber) maxNumber = number;
            if (number < minNumber) minNumber = number;
        }
        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
