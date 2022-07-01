package SoftUni.advancedMay.advanced.functionalProgramming.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class P09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] dividers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        BiPredicate<Integer, Integer> validateDelimiters = (number, divider) -> divider != 0 && number % divider == 0;
        Consumer<Integer> printer = number -> System.out.print(number + " ");
        Predicate<Integer> filter = number -> Arrays.stream(dividers).allMatch(divider -> validateDelimiters.test(number, divider));

        IntStream.range(1, n + 1).filter(filter::test).forEach(printer::accept);
    }
}
