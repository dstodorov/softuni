package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P08MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordPairs = new ArrayList<>();
        List<String> mirrorWords = new ArrayList<>();

        Pattern pattern = Pattern.compile("([@|#])(?<wordOne>[A-Za-z]{3,})\\1{2}(?<wordTwo>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(scanner.nextLine());

        while (matcher.find()) {
            wordPairs.add(matcher.group());
            String leftPart = matcher.group("wordOne");
            String rightPartReversed = reverseWord(matcher.group("wordTwo"));
            if (leftPart.equals(rightPartReversed)) mirrorWords.add(matcher.group());
        }


        System.out.println(wordPairs.size() == 0 ? "No word pairs found!" : wordPairs.size() + " word pairs found!");
        if (mirrorWords.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            printMirrorWords(mirrorWords);
        }
    }

    private static void printMirrorWords(List<String> mirrorWords) {
        Pattern pattern = Pattern.compile("^([@|#])(?<wordOne>[A-Za-z]{3,})\\1{2}(?<wordTwo>[A-Za-z]{3,})\\1$");

        for (int i = 0; i < mirrorWords.size(); i++) {
            Matcher matcher = pattern.matcher(mirrorWords.get(i));
            if (matcher.find()) {
                String left = matcher.group("wordOne");
                String right = matcher.group("wordTwo");
                if (i != mirrorWords.size() - 1) {
                    System.out.printf("%s <=> %s, ", left, right);
                } else {
                    System.out.printf("%s <=> %s", left, right);
                }
            }

        }
    }

    private static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
