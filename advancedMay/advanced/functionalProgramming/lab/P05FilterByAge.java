package SoftUni.advancedMay.advanced.functionalProgramming.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class P05FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(",\\s");
            people.put(input[0], Integer.parseInt(input[1]));
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();


        BiPredicate<Integer, Integer> filerByConditions;
        if (condition.equals("younger")) {
            filerByConditions = (a, l) -> a <= l;
        } else {
            filerByConditions = (a, l) -> a >= l;
        }

        Consumer<Map.Entry<String, Integer>> printer;
        if (format.equals("name")) {
            printer = person -> System.out.println(person.getKey());
        } else if (format.equals("age")) {
            printer = person -> System.out.println(person.getValue());
        } else {
            printer = person -> System.out.println(person.getKey() + " - " + person.getValue());
        }

        people.entrySet()
                .stream()
                .filter(person -> filerByConditions.test(person.getValue(), age))
                .forEach(printer);
    }
}
