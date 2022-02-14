package SoftUni.fundamentalsJanuary.lists.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messageCount = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();
        for (int i = 0; i < messageCount; i++) {
            String[] message = scanner.nextLine().split(" ");
            String guestName = message[0];

            if (message[2].equals("not")) {
                if (checkIsInTheList(guestList, guestName)) {
                    removeGuest(guestList, guestName);
                } else {
                    System.out.printf("%s is not in the list!%n", guestName);
                }
            } else {
                if (!checkIsInTheList(guestList, guestName)) {
                    addGuest(guestList, guestName);
                } else {
                    System.out.printf("%s is already in the list!%n", guestName);
                }
            }
        }
        printGuestList(guestList);
    }

    private static void printGuestList(List<String> guestList) {
        for (String guest : guestList) {
            System.out.println(guest);
        }
    }

    private static void addGuest(List<String> guestList, String guestName) {
        guestList.add(guestName);
    }

    private static void removeGuest(List<String> guestList, String guestName) {
        for (int i = 0; i < guestList.size(); i++) {
            if (guestList.get(i).equals(guestName)) guestList.remove(i--);
        }
    }

    private static boolean checkIsInTheList(List<String> guestList, String guestName) {
        boolean found = false;

        for (String guest : guestList) {
            if (guest.equals(guestName)) {
                found = true;
                break;
            }
        }

        return found;
    }
}
