package SoftUni.fundamentalsJanuary.dataTypesAndVariables.lab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= number; i++) {
            int sum = 0;
            int tempNumber = i;
            boolean isSpecial = false;
            while (tempNumber > 0) {
                sum += tempNumber % 10;
                tempNumber /= 10;
            }
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial) {
                System.out.printf("%d -> %s%n", i, "True");
            } else {
                System.out.printf("%d -> %s%n", i, "False");
            }
        }
    }
}
