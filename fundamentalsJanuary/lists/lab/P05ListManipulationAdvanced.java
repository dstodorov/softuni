package SoftUni.fundamentalsJanuary.lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] splitted = input.split(" ");
            String command = splitted[0];

            if (command.equals("Contains")) {
                int number = Integer.parseInt(splitted[1]);
                contains(listOfNumbers, number);
            } else if (input.equals("Print even")) {
                printAllEvenNumbers(listOfNumbers);
            } else if (input.equals("Print odd")) {
                printAllOddNumbers(listOfNumbers);
            } else if (input.equals("Get sum")) {
                sumAllElements(listOfNumbers);
            } else if (command.equals("Filter")) {
                String condition = splitted[1];
                int number = Integer.parseInt(splitted[2]);
                printByFilter(listOfNumbers, condition, number);
            }
            input = scanner.nextLine();
        }
    }

    static void contains(List<Integer> listOfNumbers, int number) {
        boolean found = false;
        for (int item : listOfNumbers) {
            if (item == number) {
                found = true;
                break;
            }
        }

        if (found) System.out.println("Yes");
        else System.out.println("No such number");
    }

    static void printAllEvenNumbers(List<Integer> listOfNumbers) {
        for (int number : listOfNumbers) {
            if (number % 2 == 0) System.out.print(number + " ");
        }
        System.out.println();
    }

    static void printAllOddNumbers(List<Integer> listOfNumbers) {
        for (int number : listOfNumbers) {
            if (number % 2 != 0) System.out.print(number + " ");
        }
        System.out.println();
    }

    static void sumAllElements(List<Integer> listOfNumbers) {
        int sum = 0;
        for (int number : listOfNumbers) {
            sum += number;
        }

        System.out.println(sum);
    }

    static void printByFilter(List<Integer> listOfNumbers, String condition, int number) {
        if (condition.equals("<")) {
            printElementsSmallerThan(listOfNumbers, number);
        } else if (condition.equals(">")) {
            printElementsBiggerThan(listOfNumbers, number);
        } else if (condition.equals(">=")) {
            printElementsBiggerOrEqualThan(listOfNumbers, number);
        } else if (condition.equals("<=")) {
            printElementsSmallerOrEqualThan(listOfNumbers, number);
        }
    }

    private static void printElementsSmallerThan(List<Integer> listOfNumbers, int number) {
        for (int element : listOfNumbers) {
            if (element < number) System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void printElementsBiggerThan(List<Integer> listOfNumbers, int number) {
        for (int element : listOfNumbers) {
            if (element > number) System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void printElementsBiggerOrEqualThan(List<Integer> listOfNumbers, int number) {
        for (int element : listOfNumbers) {
            if (element >= number) System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void printElementsSmallerOrEqualThan(List<Integer> listOfNumbers, int number) {
        for (int element : listOfNumbers) {
            if (element <= number) System.out.print(element + " ");
        }
        System.out.println();
    }
}
