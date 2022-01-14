package SoftUni.fundamentalsJanuary.basicSyntax.exercises;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int numberOrig = number;
        int totalSum = 0;

        while (number != 0) {
            int digit = number % 10;
            int innerSum = 1;
            for (int j = 1; j <= digit; j++) {
                innerSum *= j;
            }
            totalSum += innerSum;
            number /= 10;
        }
        if(totalSum == numberOrig) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
