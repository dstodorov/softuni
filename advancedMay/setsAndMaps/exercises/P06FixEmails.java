package SoftUni.advancedMay.setsAndMaps.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^(?<=\\s)[A-Za-z0-9]+([-.]\\w+)*@[A-Za-z]+?([.-][A-Za-z]*)*(\\.(?<domain>[A-Za-z]{2,}))$");

        String input = scanner.nextLine();
        Map<String, String> userEmailAddresses = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String name = input;
            String email = scanner.nextLine();


            if (!email.contains(".uk") && !email.contains(".us") && !email.contains(".com")) {
                userEmailAddresses.putIfAbsent(name, email);
            }

            input = scanner.nextLine();
        }

        userEmailAddresses.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
    }
}
