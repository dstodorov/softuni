package SoftUni.advancedMay.advanced.stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] n = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int number : n) {
            stack.push(number);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
