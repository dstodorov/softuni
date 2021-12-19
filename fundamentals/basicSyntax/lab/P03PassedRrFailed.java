package SoftUni.fundamentals.basicSyntax.lab;

import java.util.Scanner;

public class P03PassedRrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float number = Float.parseFloat(scanner.nextLine());

        if (number < 3) System.out.println("Failed!");
        else System.out.println("Passed!");
    }
}
