package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P17TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialLoot = scanner.nextLine().split("\\|");

        List<String> chest = new ArrayList<>(Arrays.stream(initialLoot).collect(Collectors.toList()));

        String rawInput = scanner.nextLine();

        while (!rawInput.equals("Yohoho!")) {
            String[] inputCommands = rawInput.split(" ");
            String command = inputCommands[0];

            switch (command) {
                case "Loot":
                    String[] items = getItems(inputCommands);
                    lootItems(chest, items);
                    break;
                case "Drop":
                    int index = Integer.parseInt(inputCommands[1]);
                    if (isValidIndex(chest, index)) {
                        String item = chest.get(index);
                        chest.remove(index);
                        chest.add(item);
                    }
                    break;
                case "Steal":
                    int itemCount = Integer.parseInt(inputCommands[1]);
                    stealLoot(chest, itemCount);
                    break;
            }

            rawInput = scanner.nextLine();
        }

        if (chest.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double averageGain = getAverageTreasureGain(chest);
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        }
    }

    private static double getAverageTreasureGain(List<String> chest) {
        double totalLength = 0;
        int itemCount = 0;
        for (String item : chest) {
            totalLength += item.length();
            itemCount++;
        }
        return totalLength / itemCount;
    }

    private static void stealLoot(List<String> chest, int itemCount) {
        List<String> stolenItems = new ArrayList<>();
        if (itemCount > chest.size()) itemCount = chest.size();
        for (int i = chest.size() - itemCount; i < chest.size(); i++) {
            stolenItems.add(chest.get(i));
        }
        printItems(stolenItems);

        chest.removeAll(stolenItems);
    }

    private static void printItems(List<String> stolenItems) {

        for (int i = 0; i < stolenItems.size(); i++) {
            if (i != stolenItems.size() - 1) {
                System.out.print(stolenItems.get(i) + ", ");
            } else {
                System.out.println(stolenItems.get(i));
            }
        }
    }

    private static boolean isValidIndex(List<String> chest, int index) {
        return index >= 0 && index <= chest.size() - 1;
    }

    private static void lootItems(List<String> chest, String[] items) {
        for (String item : items) {
            if (!chest.contains(item)) {
                chest.add(0, item);
            }
        }
    }

    private static String[] getItems(String[] loot) {
        String[] items = new String[loot.length - 1];

        for (int i = 1; i < loot.length; i++) {
            items[i - 1] = loot[i];
        }

        return items;
    }
}

