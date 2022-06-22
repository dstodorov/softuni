package SoftUni.advancedMay.examPreparation.exam06;

import java.util.*;

public class P01OSTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tasks = new ArrayDeque<>();
        ArrayDeque<Integer> threads = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).forEach(tasks::push);
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(threads::offer);
        int taskToBeKilled = Integer.parseInt(scanner.nextLine());
        int thread = 0;
        while (true) {
            if (tasks.peek() == taskToBeKilled) {
                thread = threads.peek();
                break;
            }
            if (threads.peek() >= tasks.peek()) {
                tasks.pop();
                threads.remove();
            } else {
                threads.remove();
            }
        }

        System.out.printf("Thread with value %d killed task %d%n", thread, taskToBeKilled);
        threads.forEach(t -> System.out.print(t + " "));
    }
}
