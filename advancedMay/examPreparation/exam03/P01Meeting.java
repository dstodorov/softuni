package SoftUni.advancedMay.examPreparation.exam03;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> males = new ArrayDeque<>();
        ArrayDeque<Integer> females = new ArrayDeque<>();
        Arrays.stream(Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()).forEach(males::push);
        Arrays.stream(Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()).forEach(females::offer);
        int matches = 0;

        while (!males.isEmpty() && !females.isEmpty()) {
            int maleValue = males.peek();
            int femaleValue = females.peek();
            boolean match = males.peek().equals(females.peek());

            if (males.peek() <= 0) {
                males.pop();
                continue;
            }
            if (females.peek() <= 0) {
                females.remove();
                continue;
            }

            if (maleValue % 25 == 0) {
                males.pop();
                males.pop();
                continue;
            }
            if (femaleValue % 25 == 0) {
                females.remove();
                females.remove();
                continue;
            }

            if (match) {
                males.pop();
                matches++;
                females.remove();
            } else {
                males.push(males.pop() - 2);
                females.remove();
            }
        }

        System.out.println("Matches: " + matches);
        System.out.print("Males left: ");
        System.out.println(males.isEmpty() ? "none" : males.stream().
                map(String::valueOf)
                .collect(Collectors.joining(", ")).trim());
        System.out.print("Females left: ");
        System.out.println(females.isEmpty() ? "none" : females.stream().
                map(String::valueOf)
                .collect(Collectors.joining(", ")).trim());
    }
}

