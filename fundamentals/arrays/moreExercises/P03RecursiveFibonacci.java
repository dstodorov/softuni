package SoftUni.fundamentals.arrays.moreExercises;

import java.util.Scanner;

public class P03RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int fibonacci = getFibonacci(n);
        System.out.println(fibonacci);
    }

    private static int getFibonacci(int n) {
        if (n <= 1) return n;
        return getFibonacci(n-1) + getFibonacci(n-2);
    }
}
