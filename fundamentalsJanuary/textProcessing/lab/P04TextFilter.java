package SoftUni.fundamentalsJanuary.textProcessing.lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");
        String sentence = scanner.nextLine();

        for (String word : words) {
            StringBuilder replacement = new StringBuilder();
            replacement.append("*".repeat(word.length()));
            if (sentence.contains(word)) {
                sentence = sentence.replaceAll(word, replacement.toString());
            }
        }

        System.out.println(sentence);
    }
}
