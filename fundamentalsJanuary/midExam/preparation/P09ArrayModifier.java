package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rawNumbers = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (String number : rawNumbers) {
            numbers.add(Integer.parseInt(number));
        }

        String rawCommands = scanner.nextLine();

        while (!rawCommands.equals("end")) {
            String[] commands = rawCommands.split(" ");
            String command = commands[0];

            if (command.equals("swap")) {
                int indexOne = Integer.parseInt(commands[1]);
                int indexTwo = Integer.parseInt(commands[2]);

                swap(numbers, indexOne, indexTwo);
            } else if (command.equals("multiply")) {
                int indexOne = Integer.parseInt(commands[1]);
                int indexTwo = Integer.parseInt(commands[2]);

                multiply(numbers, indexOne, indexTwo);
            } else if (command.equals("decrease")) {
                decrease(numbers);
            }

            rawCommands = scanner.nextLine();
        }

        printNumbers(numbers);
    }

    private static void printNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i != numbers.size() - 1) {
                System.out.print(numbers.get(i) + ", ");
            } else {
                System.out.print(numbers.get(i));
            }
        }
    }

    private static void decrease(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) - 1);
        }
    }

    private static void multiply(List<Integer> numbers, int indexOne, int indexTwo) {
        int firstValue = numbers.get(indexOne);
        int secondValue = numbers.get(indexTwo);
        int result = firstValue * secondValue;

        numbers.set(indexOne, result);

    }

    private static void swap(List<Integer> numbers, int indexOne, int indexTwo) {
        int firstValue = numbers.get(indexOne);
        int secondValue = numbers.get(indexTwo);

        numbers.set(indexOne, secondValue);
        numbers.set(indexTwo, firstValue);

    }
}

