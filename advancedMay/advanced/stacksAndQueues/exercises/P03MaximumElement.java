package SoftUni.advancedMay.advanced.stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] commands = scanner.nextLine().split("\\s+");

            if (commands[0].equals("1")) {
                stack.push(Integer.parseInt(commands[1]));
            } else if (commands[0].equals("2")) {
                stack.pop();
            } else if (commands[0].equals("3")) {
                int max = getMaxElement(stack);
                System.out.println(max);
            }
        }
    }

    private static int getMaxElement(ArrayDeque<Integer> stack) {
        ArrayDeque<Integer> tempStack = new ArrayDeque<>(stack);
        int max = tempStack.pop();
        while (!tempStack.isEmpty()) {
            if (max < tempStack.peek()) {
                max = tempStack.pop();
            } else {
                tempStack.pop();
            }
        }
        return max;
    }
}
