package SoftUni.basics.forLoop.lab;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;

        for (int i = 0; i < n * 2; i++) {
            int number = Integer.parseInt(scanner.nextLine());;
            if(i < n) left += number;
            else right+= number;
        }
        if (left == right) System.out.printf("Yes, sum = %d",left);
        else System.out.printf("No, diff = %d", Math.abs(left - right));
    }
}
