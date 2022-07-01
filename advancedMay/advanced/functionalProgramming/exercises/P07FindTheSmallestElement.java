package SoftUni.advancedMay.advanced.functionalProgramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> getSmallestNumberIndex = listOfNumbers -> listOfNumbers
                .lastIndexOf(listOfNumbers.stream()
                        .min(Integer::compareTo)
                        .orElse(0));

        System.out.println(getSmallestNumberIndex.apply(numbers));
    }
}
