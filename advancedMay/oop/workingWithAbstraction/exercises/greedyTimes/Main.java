package SoftUni.advancedMay.oop.workingWithAbstraction.exercises.greedyTimes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        String[] items = scanner.nextLine().split("\\s+");
        Bag bag = new Bag(capacity);

        for (int i = 0; i < items.length; i += 2) {
            String itemName = items[i];
            int itemAmount = Integer.parseInt(items[i + 1]);

            String itemType = getItemType(itemName);
            if (bag.hasCapacity(itemAmount)) {
                if (bag.validateAmountRules(itemType, itemAmount)) {
                    bag.add(itemType, itemName, itemAmount);
                }
            }
        }

        System.out.println(bag);
    }

    private static String getItemType(String name) {
        String type = "";
        if (name.length() == 3) {
            type = "Cash";
        } else if (name.toLowerCase().endsWith("gem")) {
            type = "Gem";
        } else if (name.toLowerCase().equals("gold")) {
            type = "Gold";
        }
        return type;
    }
}