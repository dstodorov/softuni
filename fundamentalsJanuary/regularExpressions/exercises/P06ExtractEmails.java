package SoftUni.fundamentalsJanuary.regularExpressions.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<=\\s)[A-Za-z0-9]+([-.]\\w+)*@[A-Za-z]+?([.-][A-Za-z]*)*(\\.[A-Za-z]{2,})");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
