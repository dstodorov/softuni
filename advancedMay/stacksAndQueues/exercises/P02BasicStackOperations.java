package SoftUni.advancedMay.stacksAndQueues.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] params = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int n = params[0];
        int s = params[1];
        int x = params[2];

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        pushElements(stack, n, numbers);
        popElements(stack, s);

        if (stack.isEmpty()) System.out.println(0);
        else if (isElementExist(stack, x)) {
            System.out.println("true");
        } else {
            printSmallestElement(stack);
        }
    }

    private static void printSmallestElement(ArrayDeque<Integer> stack) {
        int smallestElement = stack.pop();
        while (stack.size() > 0) {
            if (stack.peek() < smallestElement) {
                smallestElement = stack.pop();
            } else {
                stack.pop();
            }
        }
        System.out.println(smallestElement);
    }

    private static boolean isElementExist(ArrayDeque<Integer> stack, int element) {
        return stack.contains(element);
    }

    private static void popElements(ArrayDeque<Integer> stack, int numberOfElements) {
        while (numberOfElements > 0) {
            stack.pop();
            numberOfElements--;
        }
    }

    private static void pushElements(ArrayDeque<Integer> stack, int count, List<Integer> numbers) {
        for (int i = 0; i < count; i++) {
            stack.push(numbers.get(i));
        }
    }
}
