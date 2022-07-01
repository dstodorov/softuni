package SoftUni.advancedMay.advanced.functionalProgramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.equals("add")) {
                numbers = numbers.stream().map(number -> number + 1).collect(Collectors.toList());
            } else if (command.equals("multiply")) {
                numbers = numbers.stream().map(number -> number * 2).collect(Collectors.toList());
            } else if (command.equals("subtract")) {
                numbers = numbers.stream().map(number -> number - 1).collect(Collectors.toList());
            } else if (command.equals("print")) {
                numbers.forEach(number -> System.out.print(number + " "));
                System.out.println();
            }
            command = scanner.nextLine();
        }
    }
}
