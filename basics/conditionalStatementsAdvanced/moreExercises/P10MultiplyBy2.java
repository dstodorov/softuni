package SoftUni.basics.conditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        do {
            number = Double.parseDouble(scanner.nextLine());
            if (number >= 0) {
                System.out.printf("Result: %.2f%n", number * 2);
            } else {
                System.out.println("Negative number!");
            }
        } while (number >= 0);
    }
}
