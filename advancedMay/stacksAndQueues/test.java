package SoftUni.advancedMay.stacksAndQueues;

import java.util.ArrayDeque;

public class test {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack -> " + stack);

        stack.pop();
        System.out.println("Stack -> " + stack);

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Queue -> " + queue);

        queue.poll();
        System.out.println("Queue -> " + queue);

    }
}
