package SoftUni.fundamentals.methods.labs;

import java.util.Scanner;

public class P03Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printTriangle(Integer.parseInt(scanner.nextLine()));
    }

    static void printTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = number - 1; i >= 1 ; i--) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
