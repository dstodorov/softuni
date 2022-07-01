package SoftUni.advancedMay.advanced.examPreparation.exam08;

import java.util.*;

public class P01MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstBox = new ArrayDeque<>();
        ArrayDeque<Integer> secondBox = new ArrayDeque<>();

        int claimedItems = 0;

        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(firstBox::offer);
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(secondBox::push);

        Map<String, Integer> map = new LinkedHashMap<>();

        while (!firstBox.isEmpty() && !secondBox.isEmpty()) {
            int sum = firstBox.peek() + secondBox.peek();

            if (sum % 2 == 0) {
                claimedItems += sum;
                firstBox.poll();
                secondBox.pop();

            } else {
                firstBox.add(secondBox.pop());
            }

        }

        if (firstBox.isEmpty()) {
            System.out.println("First magic box is empty.");
        }
        if (secondBox.isEmpty()) {
            System.out.println("Second magic box is empty.");
        }
        if (claimedItems >= 90) {
            System.out.println("Wow, your prey was epic! Value: " + claimedItems);
        } else {
            System.out.println("Poor prey... Value: " + claimedItems);
        }
    }
}
