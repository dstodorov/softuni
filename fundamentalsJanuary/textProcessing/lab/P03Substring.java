package SoftUni.fundamentalsJanuary.textProcessing.lab;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String text = scanner.nextLine();

        String output = removeWordOccurrence(text, word);
        System.out.println(output);
    }

    private static String removeWordOccurrence(String text, String word) {
        while (text.contains(word)) {
            int wordIndex = text.indexOf(word);
            text = text.substring(0, wordIndex) + text.substring(wordIndex + word.length());
        }
        return text;
    }
}
