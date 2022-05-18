package SoftUni.advancedMay.setsAndMaps.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> phoneBook = new LinkedHashMap<>();

        while (!input.equals("search")) {
            String[] contactInformation = input.split("-");
            String contactName = contactInformation[0];
            String contactNumber = contactInformation[1];

            phoneBook.put(contactName, contactNumber);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("stop")) {
            if (phoneBook.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, phoneBook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }

            input = scanner.nextLine();
        }
    }
}
