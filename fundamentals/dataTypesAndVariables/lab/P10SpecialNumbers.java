package SoftUni.fundamentals.dataTypesAndVariables.lab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int temp = i;

            boolean isSpecial = false;
            if (n > 9) {
                int sum = 0;
                do {
                    sum += temp % 10;
                    temp /= 10;
                } while (temp != 0);
                isSpecial = sum == 5 || sum == 7 || sum == 11;
            } else {
                isSpecial = i == 5 || i == 7;
            }
            System.out.printf("%d -> %s%n", i, isSpecial ? "True" : "False");
        }
    }
}
