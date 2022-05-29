package SoftUni.advancedMay.functionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SortEvenNumbers {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.stream(new Scanner(System.in).nextLine().split(",\\s")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).map(Object::toString).collect(Collectors.toList());
        System.out.println(String.join(", ", evenNumbers));
        List<String> sortedEvenNumbers = numbers.stream().filter(number -> number % 2 == 0).sorted().map(Object::toString).collect(Collectors.toList());
        System.out.println(String.join(", ", sortedEvenNumbers));
    }
}
