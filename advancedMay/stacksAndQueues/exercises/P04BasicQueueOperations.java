package SoftUni.advancedMay.stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] params = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(params[0]);
        int s = Integer.parseInt(params[1]);
        int x = Integer.parseInt(params[2]);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>(n);

        addElements(queue, numbers);
        deleteElements(queue, s);
        boolean isElementExists = checkElementExists(queue, x);

        if (queue.isEmpty()) System.out.println(0);
        else if (isElementExists) System.out.println("true");
        else printSmallestElement(queue);
    }

    private static void printSmallestElement(ArrayDeque<Integer> queue) {
        int min = Integer.MAX_VALUE;

        for (Integer number : queue) {
            if (number < min) min = number;
        }

        System.out.println(min);
        ;
    }

    private static boolean checkElementExists(ArrayDeque<Integer> queue, int number) {
        return queue.contains(number);
    }

    private static void deleteElements(ArrayDeque<Integer> queue, int count) {
        for (int i = 0; i < count; i++) {
            queue.poll();
        }
    }

    private static void addElements(ArrayDeque<Integer> queue, int[] numbers) {
        for (int number : numbers) {
            queue.offer(number);
        }
    }
}
