package SoftUni.advancedMay.advanced.examPreparation.exam02;

import java.util.*;
import java.util.stream.Collectors;

public class P01FoodFinder {
    public static void main(String[] args) {

        List<Map<Character, Integer>> foods = createFoods();

        Scanner scanner = new Scanner(System.in);

        String[] vowelsAsStrings = scanner.nextLine().split("\\s+");
        ArrayDeque<Character> vowels = new ArrayDeque<>();
        for (String c : vowelsAsStrings) {
            vowels.add(c.charAt(0));
        }

        String[] consonantsAsStrings = scanner.nextLine().split("\\s+");
        ArrayDeque<Character> consonants = new ArrayDeque<>();
        for (String c : consonantsAsStrings) {
            consonants.push(c.charAt(0));
        }

        while (!consonants.isEmpty()) {
            char firstFromVowels = vowels.poll();
            vowels.add(firstFromVowels);
            char lastFromConsonants = consonants.pop();
            checkAndUpdateLetters(firstFromVowels, lastFromConsonants, foods);
        }
        int foodsFound = 0;

        for (Map<Character, Integer> food : foods) {
            boolean missingCharFound = false;
            for(Map.Entry<Character, Integer> c : food.entrySet()) {
                if (c.getValue() == 0) {
                    missingCharFound = true;
                }
            }
            if (!missingCharFound) foodsFound++;
        }

        System.out.println("Words found: " + foodsFound);
        printMatchingWords(foods);
    }

    private static List<Map<Character, Integer>> createFoods() {
        List<Map<Character, Integer>> foods = new ArrayList<>();
        Map<Character, Integer> pear = new LinkedHashMap<>();
        pear.put('p', 0);
        pear.put('e', 0);
        pear.put('a', 0);
        pear.put('r', 0);
        Map<Character, Integer> flour = new LinkedHashMap<>();
        flour.put('f', 0);
        flour.put('l', 0);
        flour.put('o', 0);
        flour.put('u', 0);
        flour.put('r', 0);
        Map<Character, Integer> pork = new LinkedHashMap<>();
        pork.put('p', 0);
        pork.put('o', 0);
        pork.put('r', 0);
        pork.put('k', 0);
        Map<Character, Integer> olive = new LinkedHashMap<>();
        olive.put('o', 0);
        olive.put('l', 0);
        olive.put('i', 0);
        olive.put('v', 0);
        olive.put('e', 0);
        foods.add(pear);
        foods.add(flour);
        foods.add(pork);
        foods.add(olive);
        return foods;
    }

    private static void printMatchingWords(List<Map<Character, Integer>> words) {
        words.forEach(word -> {
            int count = word.entrySet().stream().filter(e -> e.getValue() == 0).collect(Collectors.toList()).size();
            if (count == 0) {
                word.forEach((k, v) -> System.out.print(k));
                System.out.println();
            }
        });
    }

    private static void checkAndUpdateLetters(char first, char second, List<Map<Character, Integer>> words) {
        words.forEach(word -> {
            if (word.containsKey(first)) word.put(first, word.get(first) + 1);
            if (word.containsKey(second)) word.put(second, word.get(second) + 1);
        });
    }
}
