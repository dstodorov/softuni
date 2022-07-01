package SoftUni.advancedMay.advanced.stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P09PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPlants = Integer.parseInt(scanner.nextLine());

        int[] pesticidesArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> pesticidesStack = new ArrayDeque<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int pesticide : pesticidesArr) {
            pesticidesStack.push(pesticide);
        }

        int days = 0;
        if (pesticidesStack.size() == 1) {
            System.out.println(1);
        } else {
            while (pesticidesStack.size() > 1) {
                int right = pesticidesStack.pop();
                int left = pesticidesStack.pop();
                if (right > left) {
                    queue.offer(left);
                    days++;
                } else {
                    queue.offer(left);
                    queue.offer(right);
                }
            }
            pesticidesStack = new ArrayDeque<>(queue);
            System.out.println(days);
        }


    }
}
