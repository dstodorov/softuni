package SoftUni.fundamentalsJanuary.methods.lab;

import java.util.Scanner;

public class P01SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        getSignOfInteger(n);
    }

    private static void getSignOfInteger(int number) {
        if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else if (number == 0) {
            System.out.printf("The number %d is zero.", number);
        }
        else {
            System.out.printf("The number %d is positive.", number);
        }
    }
}
