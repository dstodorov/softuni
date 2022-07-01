package SoftUni.advancedMay.advanced.functionalProgramming.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class P06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> isLowerLength = name -> name.length() <= n;

        Arrays.stream(names).filter(isLowerLength).forEach(System.out::println);
    }
}
