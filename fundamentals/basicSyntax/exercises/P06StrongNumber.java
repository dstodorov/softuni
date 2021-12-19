package SoftUni.fundamentals.basicSyntax.exercises;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int saved = number;
        int sum = 0;
        while (true) {
            int innerNumber = number % 10;
            int innerSum = 1;
            for (int i = 1; i <= innerNumber; i++) {
                innerSum *= i;
            }
            sum += innerSum;
            number /= 10;
            if (number == 0) break;
        }
        if (sum == saved) System.out.println("yes");
        else System.out.println("no");
    }
}
