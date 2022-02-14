package SoftUni.fundamentalsJanuary.lists.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> text = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String rawInput = scanner.nextLine();

        while (!rawInput.equals("3:1")) {
            String[] inputCommands = rawInput.split(" ");
            String command = inputCommands[0];

            if (command.equals("merge")) {
                int startIndex = Integer.parseInt(inputCommands[1]);
                int endIndex = Integer.parseInt(inputCommands[2]);

                merge(text, startIndex, endIndex);

            } else if (command.equals("divide")) {
                int index = Integer.parseInt(inputCommands[1]);
                int partitions = Integer.parseInt(inputCommands[2]);

                divide(text, index, partitions);
            }
            rawInput = scanner.nextLine();
        }
        printList(text);
    }

    private static void divide(List<String> text, int index, int partitions) {
        String element = text.get(index);
        text.remove(index);
        int partLength = element.length() / partitions;

        List<String> dividedList = new ArrayList<>();
        if (element.length() % partitions == 0) {
            for (int i = 0; i < element.length(); i += partLength) {
                String part = element.substring(i, i + partLength);
                dividedList.add(part);
            }
        } else {
            int counter = 0;
            boolean stop = false;
            for (int i = 0; i < element.length(); i += partLength) {
                String part;
                if (counter == partitions - 1) {
                    part = element.substring(i);
                    stop = true;
                } else {
                    part = element.substring(i, i + partLength);
                }
                dividedList.add(part);
                if (stop) break;
                counter++;
            }
        }
        text.addAll(index, dividedList);
    }

    private static void printList(List<String> text) {
        for (String element : text) {
            System.out.print(element + " ");
        }
    }

    private static void merge(List<String> text, int startIndex, int endIndex) {
        int correctStartIndex = getCorrectStartIndex(text, startIndex);
        int correctEndIndex = getCorrectEndIndex(text, endIndex);
        if (startIndex != correctStartIndex) startIndex = correctStartIndex;
        if (endIndex != correctEndIndex) endIndex = correctEndIndex;
        mergeIndexesInRange(text, startIndex, endIndex);
    }

    private static int getCorrectEndIndex(List<String> text, int endIndex) {
        if (endIndex >= 0 && endIndex <= text.size() - 1) {
            return endIndex;
        } else if (endIndex < 0) {
            return 0;
        } else {
            return text.size() - 1;
        }
    }

    private static int getCorrectStartIndex(List<String> text, int startIndex) {
        if (startIndex >= 0 && startIndex <= text.size() - 1) {
            return startIndex;
        } else if (startIndex >= 0 && startIndex > text.size() - 1) {
            return text.size() - 1;
        }
        return 0;
    }

    private static void mergeIndexesInRange(List<String> text, int startIndex, int endIndex) {
        StringBuilder mergedElements = new StringBuilder();

        for (int i = startIndex; i <= endIndex; i++) {
            mergedElements.append(text.get(i));
        }

        for (int i = endIndex; i >= startIndex; i--) {
            text.remove(i);
        }

        text.add(startIndex, mergedElements.toString());
    }
}
