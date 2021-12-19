package SoftUni.fundamentals.dataTypesAndVariables.lab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= counter; i++) {
            int sum = 0;
            boolean isSpecial = false;
            int temp = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            String special = isSpecial ? "True" : "False";
            System.out.printf("%d -> %s%n", temp, special);
            i = temp;
        }
    }
}
