package SoftUni.advancedMay.iteratorsAndComparators.exercises.listyIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s")).skip(1).collect(Collectors.toList());
        String command = scanner.nextLine();
        ListyIterator listyIterator = new ListyIterator(elements);
        while (!command.equals("END")) {
            String[] inputParams = command.split("\\s+");
            switch (inputParams[0]) {
                case "Move": {
                    System.out.println(listyIterator.move());
                    break;
                }
                case "Print": {
                    listyIterator.print();
                    break;
                }
                case "HasNext": {
                    System.out.println(listyIterator.hasNext());
                    break;
                }
            }

            command = scanner.nextLine();
        }
    }
}
