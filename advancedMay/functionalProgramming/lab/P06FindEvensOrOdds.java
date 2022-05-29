package SoftUni.advancedMay.functionalProgramming.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbers = new int[range[1] - range[0] + 1];
        int c = 0;
        for (int i = range[0]; i <= range[1]; i++) {
            numbers[c] = i;
            c++;
        }

        String type = scanner.nextLine();

        Predicate<Integer> filter;


        if (type.equals("even")) {
            filter = n -> n % 2 == 0;
        } else {
            filter = n -> n % 2 != 0;
        }

        Consumer<Integer> printer = number -> System.out.print(number + " ");

        Arrays.stream(numbers)
                .filter(filter::test)
                .forEach(printer::accept);
    }
}
