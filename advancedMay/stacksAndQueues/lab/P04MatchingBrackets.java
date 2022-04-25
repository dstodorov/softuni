package SoftUni.advancedMay.stacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') stack.push(i);
            if (text.charAt(i) == ')' && stack.size() > 0) {
                System.out.println(text.substring(stack.peek(), i + 1));
                stack.pop();
            }
        }
    }
}
