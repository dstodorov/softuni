package SoftUni.fundamentalsJanuary.associativeArrays.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> charOccurrences = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c != ' ') {
                if (!charOccurrences.containsKey(c)) {
                    charOccurrences.put(c, 1);
                } else {
                    charOccurrences.put(c, charOccurrences.get(c) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> occurrence : charOccurrences.entrySet()) {
            System.out.printf("%s -> %d%n", occurrence.getKey(), occurrence.getValue());
        }
    }
}
