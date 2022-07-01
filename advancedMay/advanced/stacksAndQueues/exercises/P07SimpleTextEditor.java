package SoftUni.advancedMay.advanced.stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            int operation = Integer.parseInt(input[0]);

            switch (operation) {
                case 1: {
                    String str = input[1];
                    text.append(str);
                    stack.push(text.toString());
                    break;
                }
                case 2: {
                    int count = Integer.parseInt(input[1]);
                    text.delete(text.length() - count, text.length());
                    stack.push(text.toString());
                    break;
                }
                case 3: {
                    int index = Integer.parseInt(input[1]);
                    if (text.length() > 1) System.out.println(text.substring(index - 1, index));
                    break;
                }

                case 4: {
                    stack.pop();
                    text = stack.isEmpty() ? new StringBuilder("") : new StringBuilder(stack.peek());
                    break;
                }
            }
        }
    }
}
