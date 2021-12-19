package SoftUni.basics.forLoop.exercises;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > max) max = number;
        }

        sum -= max;

        if (sum == max) {
            System.out.printf("Yes%n");
            System.out.printf("Sum = %d", max);
        } else {
            System.out.printf("No%n");
            System.out.printf("Diff = %d", Math.abs(max - sum));
        }
    }
}
