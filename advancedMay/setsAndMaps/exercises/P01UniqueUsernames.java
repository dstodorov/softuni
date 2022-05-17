package SoftUni.advancedMay.setsAndMaps.exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < number; i++) {
            String username = scanner.nextLine();
            usernames.add(username);
        }

        usernames.forEach(System.out::println);
    }
}
