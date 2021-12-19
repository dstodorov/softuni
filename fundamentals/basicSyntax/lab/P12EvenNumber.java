package SoftUni.fundamentals.basicSyntax.lab;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean flag = n % 2 == 0;
        while (!flag) {
            System.out.println("Please write an even number.");
            n = Integer.parseInt(scanner.nextLine());
            if (n % 2 == 0) flag = true;
        }
        System.out.printf("The number is: %d", Math.abs(n));
    }
}
