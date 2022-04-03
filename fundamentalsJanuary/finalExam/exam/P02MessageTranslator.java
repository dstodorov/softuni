package SoftUni.fundamentalsJanuary.finalExam.exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("!(?<command>[A-Z][a-z]{3,})!:\\[(?<string>[A-Za-z]{8,})]");


        for (int i = 0; i < count; i++) {
            String str = scanner.nextLine();
            Matcher matcher = pattern.matcher(str);
            if (!matcher.find()) {
                System.out.println("The message is invalid");
            } else {
                String command = matcher.group("command");
                System.out.print(command + ": ");
                printCharactersAsciiCodes(matcher.group("string"));
                System.out.println();
            }

        }
    }

    private static void printCharactersAsciiCodes(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                System.out.print((int) text.charAt(i) + " ");
            }
        }
    }
}
