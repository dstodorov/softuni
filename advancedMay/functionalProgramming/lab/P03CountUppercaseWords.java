package SoftUni.advancedMay.functionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P03CountUppercaseWords {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in).nextLine().split("\\s");
        Predicate<String> filterUpperCaseWords = word -> Character.isUpperCase(word.charAt(0));

        List<String> upperCaseWords = Arrays.stream(input).filter(filterUpperCaseWords).collect(Collectors.toList());
        System.out.println(upperCaseWords.size());
        upperCaseWords.forEach(System.out::println);
    }
}
