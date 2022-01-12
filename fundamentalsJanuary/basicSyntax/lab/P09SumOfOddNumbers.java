package SoftUni.fundamentalsJanuary.basicSyntax.lab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        int oddSum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int c = 0;
        for (int i = 1; i <= 99; i += 2) {
            c++;
            oddSum+=i;
            System.out.println(i);
            if (c == n) break;
        }
        System.out.printf("Sum: %d", oddSum);
    }
}
