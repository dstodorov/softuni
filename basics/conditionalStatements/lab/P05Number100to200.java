package SoftUni.basics.conditionalStatements.lab;

import java.util.Scanner;

public class P05Number100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n < 100) {
            System.out.println("Less than 100");
        }
        if (n >= 100 && n <= 200) {
            System.out.println("Between 100 and 200");
        }
        if (n > 200) {
            System.out.println("Greater than 200");
        }
    }
}
