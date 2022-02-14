package SoftUni.fundamentalsJanuary.lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String rawInput = scanner.nextLine();

        while (!rawInput.equals("end")) {
            String[] commandLine = rawInput.split(" ");
            String command = commandLine[0];


            if (command.equals("Delete")) {
                int element = Integer.parseInt(commandLine[1]);
                deleteElement(listOfNumbers, element);
            } else if (command.equals("Insert")) {
                int element = Integer.parseInt(commandLine[1]);
                int position = Integer.parseInt(commandLine[2]);
                insertElement(listOfNumbers, position, element);
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

    private static void insertElement(List<Integer> listOfNumbers, int position, int element) {
        listOfNumbers.add(position, element);
    }

    private static void deleteElement(List<Integer> listOfNumbers, int element) {
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) == element) {
                listOfNumbers.remove(i--);
            }
        }
    }
}
