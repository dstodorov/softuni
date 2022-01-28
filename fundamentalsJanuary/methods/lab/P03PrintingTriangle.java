package SoftUni.fundamentalsJanuary.methods.lab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTriangle(n);
    }

    private static void printTriangle(int number) {
        for (int row = 0; row <= number; row++) {
            for (int i = 1; i <= row; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (int row = number - 1; row >= 0; row--) {
            for (int i = 1; i <= row; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
