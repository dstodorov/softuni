package SoftUni.fundamentalsJanuary.lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String inputValue = scanner.nextLine();

        while (!inputValue.equals("end")) {
            String[] splitted = inputValue.split(" ");
            String command = splitted[0];
            if (command.equals("Add")) {
                int number = Integer.parseInt(splitted[1]);
                add(listOfNumbers, number);
            } else if (command.equals("Remove")) {
                int number = Integer.parseInt(splitted[1]);
                remove(listOfNumbers, number);
            } else if (command.equals("RemoveAt")) {
                int index = Integer.parseInt(splitted[1]);
                removeAt(listOfNumbers, index);
            } else if (command.equals("Insert")) {
                int number = Integer.parseInt(splitted[1]);
                int index = Integer.parseInt(splitted[2]);
                insert(listOfNumbers, number, index);
            }
            inputValue = scanner.nextLine();
        }

        System.out.println(listOfNumbers.toString().replaceAll("[\\[\\],]", ""));

    }

    static void add(List<Integer> listOfNumbers, int number) {
        listOfNumbers.add(number);
    }

    static void remove(List<Integer> listOfNumbers, int number) {
        listOfNumbers.remove(Integer.valueOf(number));
    }

    static void removeAt(List<Integer> listOfNumbers, int index) {
        listOfNumbers.remove(index);
    }

    static void insert(List<Integer> listOfNumbers, int number, int index) {
        listOfNumbers.add(index, number);
    }
}
