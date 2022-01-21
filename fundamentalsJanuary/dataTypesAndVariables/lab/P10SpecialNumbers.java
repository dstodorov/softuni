package SoftUni.fundamentalsJanuary.dataTypesAndVariables.lab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int numberToCheck = i;

            while (numberToCheck != 0) {
                sum += numberToCheck % 10;
                numberToCheck /= 10;
            }

            if (isSpecial(sum)) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }

    private static boolean isSpecial(int sum) {
        return sum == 5 || sum == 7 || sum == 11;
    }
}
