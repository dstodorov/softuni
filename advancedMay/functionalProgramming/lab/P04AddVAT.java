package SoftUni.advancedMay.functionalProgramming.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class P04AddVAT {
    public static void main(String[] args) {
        String[] numbers = new Scanner(System.in).nextLine().split(",\\s");
        Function<String, Double> parseToDouble = Double::parseDouble;
        UnaryOperator<Double> addVAT = number -> number * 1.2;
        Consumer<Double> printer = number -> System.out.printf("%.2f%n", number);
        System.out.println("Prices with VAT:");
        Arrays.stream(numbers)
                .map(parseToDouble)
                .map(addVAT)
                .forEach(printer);
    }
}
