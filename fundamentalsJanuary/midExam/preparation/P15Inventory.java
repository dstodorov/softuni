package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P15Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> journal = getJournal(scanner);

        String rawInput = scanner.nextLine();

        while (!rawInput.equals("Craft!")) {
            String[] inputCommands = getCommands(rawInput);
            String command = inputCommands[0];
            String item = inputCommands[1];

            switch (command) {
                case "Collect":
                    if (!itemExist(journal, item)) {
                        collectItem(journal, item);
                    }
                    break;
                case "Drop":
                    if (itemExist(journal, item)) {
                        dropItem(journal, item);
                    }
                    break;
                case "Combine Items":
                    String[] items = item.split(":");
                    String oldItem = items[0];
                    String newItem = items[1];

                    if (itemExist(journal, oldItem)) {
                        combineItems(journal, oldItem, newItem);
                    }
                    break;
                case "Renew":
                    if (itemExist(journal, item)) {
                        renewItem(journal, item);
                    }
                    break;
            }

            rawInput = scanner.nextLine();
        }

        printJournal(journal, ", ");
    }

    private static void printJournal(List<String> journal, String delimiter) {
        for (int i = 0; i < journal.size(); i++) {
            if (i == journal.size() - 1) {
                System.out.print(journal.get(i));
            } else {
                System.out.print(journal.get(i) + delimiter);
            }
        }
    }

    private static void renewItem(List<String> journal, String item) {
        journal.remove(item);
        journal.add(item);
    }

    private static void combineItems(List<String> journal, String oldItem, String newItem) {
        int oldItemIndex = journal.indexOf(oldItem);
        journal.add(oldItemIndex + 1, newItem);
    }

    private static void dropItem(List<String> journal, String item) {
        journal.remove(item);
    }

    private static void collectItem(List<String> journal, String item) {
        journal.add(item);
    }

    private static boolean itemExist(List<String> journal, String item) {
        return journal.contains(item);
    }

    private static String[] getCommands(String rawInput) {
        return rawInput.split(" - ");
    }

    private static List<String> getJournal(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
    }
}

