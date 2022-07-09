package SoftUni.advancedMay.oop.workingWithAbstraction.lab;

import java.util.Scanner;

public class P01RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());


        // Print top half
        printTopHalf(size);

        // Print bottom part
        printBottomHalf(size);
    }

    private static void printBottomHalf(int size) {
        for (int i = size - 1; i >= 1; i--) {
            printStars(size, i);
        }
    }

    private static void printTopHalf(int size) {
        for (int numberOfStars = 1; numberOfStars <= size; numberOfStars++) {
            printStars(size, numberOfStars);
        }
    }

    private static void printStars(int size, int i) {
        for (int j = 0; j < size - i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
