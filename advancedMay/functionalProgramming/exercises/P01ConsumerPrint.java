package SoftUni.advancedMay.functionalProgramming.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P01ConsumerPrint {
    public static void main(String[] args) {
        String[] words = new Scanner(System.in).nextLine().split("\\s+");

        Arrays.stream(words).forEach(System.out::println);
    }
}
