package SoftUni.fundamentalsJanuary.methods.exercises;

import java.util.Scanner;

public class P07MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(getMiddleCharacter(text));
    }

    private static String getMiddleCharacter(String text) {
        String result;
        if (text.length() % 2 == 0) {
            result = text.charAt(text.length() / 2 - 1) + "" + text.charAt(text.length() / 2);
        } else {
            result = String.valueOf(text.charAt(text.length() / 2));
        }
        return result;
    }
}
