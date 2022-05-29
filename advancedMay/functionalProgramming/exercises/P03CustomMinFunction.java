package SoftUni.advancedMay.functionalProgramming.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03CustomMinFunction {
    public static void main(String[] args) {

        String[] numbersAsString = new Scanner(System.in).nextLine().split("\\s+");
        Function<String, Integer> parser = Integer::parseInt;

        int min = Arrays.stream(numbersAsString).mapToInt(parser::apply).min().orElse(0);
        System.out.println(min);
    }
}
