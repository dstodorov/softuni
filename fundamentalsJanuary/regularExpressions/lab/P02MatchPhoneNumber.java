package SoftUni.fundamentalsJanuary.regularExpressions.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";

        List<String> phoneNumbers = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            phoneNumbers.add(matcher.group(0));
        }

        for (int i = 0; i < phoneNumbers.size(); i++) {
            if (i < phoneNumbers.size() - 1) {
                System.out.print(phoneNumbers.get(i) + ", ");
            } else {
                System.out.print(phoneNumbers.get(i));
            }
        }
    }
}
