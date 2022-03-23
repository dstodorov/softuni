package SoftUni.fundamentalsJanuary.associativeArrays.lab;

import java.util.*;
import java.util.stream.Collectors;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<String, Integer> wordOccurrences = new LinkedHashMap<>();

        for (String word : words) {
            String wordToLowerCase = word.toLowerCase();
            if (!wordOccurrences.containsKey(wordToLowerCase)) {
                wordOccurrences.put(wordToLowerCase, 1);
            } else {
                wordOccurrences.put(wordToLowerCase, wordOccurrences.get(wordToLowerCase) + 1);
            }
        }

        List<String> w = wordOccurrences.entrySet().stream().filter(e -> e.getValue() % 2 != 0).map(Map.Entry::getKey).collect(Collectors.toList());

        for (int i = 0; i < w.size(); i++) {
            if (i < w.size() - 1) {
                System.out.print(w.get(i) + ", ");
            } else {
                System.out.print(w.get(i));
            }
        }
    }
}
