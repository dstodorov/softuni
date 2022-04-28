package SoftUni.advancedMay.stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        if (str.length() % 2 != 0) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                    stack.push(str.charAt(i));
                }
                if (str.charAt(i) == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    }
                } else if (str.charAt(i) == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    }
                } else if (str.charAt(i) == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
