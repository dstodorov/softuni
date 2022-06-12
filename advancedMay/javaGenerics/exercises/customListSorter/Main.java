package SoftUni.advancedMay.javaGenerics.exercises.customListSorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomList<String> elementsList = new CustomList<>();

        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("END")) {
            switch (command[0]) {
                case "Add" : {
                    String element = command[1];
                    elementsList.add(element);
                    break;
                }
                case "Remove" : {
                    int index = Integer.parseInt(command[1]);
                    elementsList.remove(index);
                    break;
                }
                case "Contains" : {
                    String element = command[1];
                    System.out.println(elementsList.contains(element) ? "true" : "false");
                    break;
                }
                case "Swap" : {
                    int firstIndex = Integer.parseInt(command[1]);
                    int secondIndex = Integer.parseInt(command[2]);
                    elementsList.swap(firstIndex, secondIndex);
                    break;
                }
                case "Greater" : {
                    String element = command[1];
                    System.out.println(elementsList.countGreaterThan(element));
                    break;
                }
                case "Max" : {
                    String max = elementsList.getMax();
                    System.out.println(max);
                    break;
                }
                case "Min" : {
                    String min = elementsList.getMin();
                    System.out.println(min);
                    break;
                }
                case "Print" : {
                    elementsList.getElements().forEach(System.out::println);
                    break;
                }
                case "Sort" : {
                    elementsList.sort();
                }

            }

            command = scanner.nextLine().split("\\s+");
        }
    }
}
