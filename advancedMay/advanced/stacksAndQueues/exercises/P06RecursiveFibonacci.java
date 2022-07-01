package SoftUni.advancedMay.advanced.stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P06RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        long fibonacci = getFibonacci(n);
        System.out.println(fibonacci);
    }

    private static long getFibonacci(long n) {
        ArrayDeque<Long> stack = new ArrayDeque<>();
        stack.push(1L);

        for (int i = 0; i < n; i++) {
            if (stack.size() > 1) {
                long last = stack.pop();
                long result = last + stack.peek();
                stack.push(last);
                stack.push(result);
            } else {
                stack.push(1L);
            }
        }
        return stack.peek();
    }
}
