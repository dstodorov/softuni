package SoftUni.advancedMay.advanced.setsAndMaps.lab;

import java.util.*;

public class P02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();
        String guestId = scanner.nextLine();

        while (!guestId.equals("PARTY")) {
            if (Character.isDigit(guestId.charAt(0)))
                vip.add(guestId);
            else
                regular.add(guestId);
            guestId = scanner.nextLine();
        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            vip.remove(input);
            regular.remove(input);
            input = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());
        vip.forEach(System.out::println);
        regular.forEach(System.out::println);
    }
}
