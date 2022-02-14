package SoftUni.fundamentalsJanuary.lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String rawInput = scanner.nextLine();

        while (!rawInput.equals("End")) {
            String[] inputCommands = rawInput.split(" ");
            String command = inputCommands[0];

            if (command.equals("Add")) {
                int number = Integer.parseInt(inputCommands[1]);
                addNumber(listOfNumbers, number);
            } else if (command.equals("Insert")) {
                int number = Integer.parseInt(inputCommands[1]);
                int position = Integer.parseInt(inputCommands[2]);
                if (position >= 0 && position <= listOfNumbers.size() - 1) {
                    insertNumber(listOfNumbers, number, position);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Remove")) {
                int position = Integer.parseInt(inputCommands[1]);
                if (position >= 0 && position <= listOfNumbers.size() - 1) {
                    removeNumber(listOfNumbers, position);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Shift")) {
                String direction = inputCommands[1];
                int count = Integer.parseInt(inputCommands[2]);
                if (direction.equals("left")) {
                    shiftLeft(listOfNumbers, count);
                } else if (direction.equals("right")) {
                    shiftRight(listOfNumbers, count);
                }
            }
            rawInput = scanner.nextLine();
        }

        printList(listOfNumbers);
    }

    private static void printList(List<Integer> listOfNumbers) {
        for (int number : listOfNumbers) {
            System.out.print(number + " ");
        }
    }

    private static void shiftRight(List<Integer> listOfNumbers, int count) {
        for (int i = 0; i < count; i++) {
            listOfNumbers.add(0, listOfNumbers.get(listOfNumbers.size() - 1));
            listOfNumbers.remove(listOfNumbers.size() - 1);
        }
    }

    private static void shiftLeft(List<Integer> listOfNumbers, int count) {
        for (int i = 0; i < count; i++) {
            listOfNumbers.add(listOfNumbers.get(0));
            listOfNumbers.remove(0);
        }
    }

    private static void removeNumber(List<Integer> listOfNumbers, int position) {
        listOfNumbers.remove(position);
    }

    private static void insertNumber(List<Integer> listOfNumbers, int number, int position) {
        listOfNumbers.add(position, number);
    }

    private static void addNumber(List<Integer> listOfNumbers, int number) {
        listOfNumbers.add(number);
    }
}
