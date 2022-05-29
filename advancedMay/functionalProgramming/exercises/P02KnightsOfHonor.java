package SoftUni.advancedMay.functionalProgramming.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P02KnightsOfHonor {
    public static void main(String[] args) {

        String[] names = new Scanner(System.in).nextLine().split("\\s+");

        Arrays.stream(names).forEach(name -> System.out.println("Sir " + name));
    }
}
