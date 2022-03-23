package SoftUni.fundamentalsJanuary.associativeArrays.lab;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonyms.containsKey(word)) {
                List<String> wordSynonym = new ArrayList<>();
                wordSynonym.add(synonym);
                synonyms.put(word, wordSynonym);
            } else {
                synonyms.get(word).add(synonym);
            }
        }


        for (Map.Entry<String, List<String>> words : synonyms.entrySet()) {
            System.out.printf("%s - ", words.getKey());
            for (int i = 0; i < words.getValue().size(); i++) {
                if (i != words.getValue().size() - 1) {
                    System.out.printf("%s, ", words.getValue().get(i));
                } else {
                    System.out.printf("%s%n", words.getValue().get(i));
                }
            }
        }
    }
}
