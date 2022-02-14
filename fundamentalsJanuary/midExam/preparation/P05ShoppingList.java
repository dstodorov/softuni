package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!+")).collect(Collectors.toList());

        String rawInput = scanner.nextLine();

        while (!rawInput.equals("Go Shopping!")) {
            String[] rawCommands = rawInput.split(" ");
            String command = rawCommands[0];

            if (command.equals("Urgent")) {
                String item = rawCommands[1];
                if (!isItemExists(shoppingList, item)) {
                    addUrgentItem(shoppingList, item);
                }
            } else if (command.equals("Unnecessary")) {
                String item = rawCommands[1];
                if (isItemExists(shoppingList, item)) {
                    int itemIndex = shoppingList.indexOf(item);
                    deleteItem(shoppingList, itemIndex);
                }
            } else if (command.equals("Correct")) {
                String oldItem = rawCommands[1];
                String newItemValue = rawCommands[2];

                if (isItemExists(shoppingList, oldItem)) {
                    int oldItemIndex = shoppingList.indexOf(oldItem);
                    renameItem(shoppingList, oldItemIndex, newItemValue);
                }
            } else if (command.equals("Rearrange")) {
                String item = rawCommands[1];
                if (isItemExists(shoppingList, item)) {
                    int itemIndex = shoppingList.indexOf(item);
                    rearrangeItem(shoppingList, itemIndex);
                }
            }

            rawInput = scanner.nextLine();
        }

        printShoppingLists(shoppingList);


    }

    private static void rearrangeItem(List<String> shoppingList, int itemIndex) {
        List<String> tempShoppingList = new ArrayList<>();
        String itemValue = shoppingList.get(itemIndex);

        for (int i = 0; i < shoppingList.size(); i++) {
            if (i != itemIndex) {
                tempShoppingList.add(shoppingList.get(i));
            }
        }

        shoppingList.clear();
        shoppingList.addAll(tempShoppingList);
        shoppingList.add(itemValue);
    }

    private static void renameItem(List<String> shoppingList, int oldItemIndex, String newItemValue) {
        shoppingList.set(oldItemIndex, newItemValue);
    }

    private static void deleteItem(List<String> shoppingList, int itemIndex) {
        shoppingList.remove(itemIndex);
    }

    private static void printShoppingLists(List<String> shoppingList) {
        for (int i = 0; i < shoppingList.size(); i++) {
            if (i < shoppingList.size() - 1) {
                System.out.print(shoppingList.get(i) + ", ");
            } else {
                System.out.print(shoppingList.get(i));
            }
        }
    }

    private static void addUrgentItem(List<String> shoppingList, String item) {
        List<String> tempShoppingList = new ArrayList<>();
        tempShoppingList.add(item);
        tempShoppingList.addAll(shoppingList);

        shoppingList.clear();
        shoppingList.addAll(tempShoppingList);
    }

    private static boolean isItemExists(List<String> shoppingList, String item) {
        return shoppingList.contains(item);
    }
}
