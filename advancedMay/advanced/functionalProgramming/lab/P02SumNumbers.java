package SoftUni.advancedMay.advanced.functionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02SumNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.stream(new Scanner(System.in).nextLine().split(",\\s")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println("Count = " + numbers.size());
        int sum = Arrays.stream(numbers.stream().mapToInt(e -> e).toArray()).sum();
        System.out.println("Sum = " + sum);
    }
}
