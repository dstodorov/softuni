package SoftUni.fundamentals.basicSyntax.exercises;

import java.util.Scanner;

public class P02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String text = "";
        boolean flag = false;

        if (n % 2 == 0) {
            text = String.format("The number is divisible by %d", 2);
            flag = true;
        }
        if (n % 3 == 0) {
            text = String.format("The number is divisible by %d", 3);
            flag = true;
        }
        if (n % 6 == 0) {
            text = String.format("The number is divisible by %d", 6);
            flag = true;
        }
        if (n % 7 == 0) {
            text = String.format("The number is divisible by %d", 7);
            flag = true;
        }
        if (n % 10 == 0) {
            text = String.format("The number is divisible by %d", 10);
            flag = true;
        }
        if (!flag) {
            System.out.println("Not divisible");
        } else {
            System.out.println(text);
        }
    }
}
