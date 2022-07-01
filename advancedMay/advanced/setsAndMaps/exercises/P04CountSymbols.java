package SoftUni.advancedMay.advanced.setsAndMaps.exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<String, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            if (symbols.containsKey(String.valueOf(text.charAt(i)))) {
                symbols.put(String.valueOf(text.charAt(i)), symbols.get(String.valueOf(text.charAt(i))) + 1);
            } else {
                symbols.put(String.valueOf(text.charAt(i)), 1);
            }
        }

        symbols.forEach((key, value) -> System.out.printf("%s: %d time/s%n", key, value));

    }
}
