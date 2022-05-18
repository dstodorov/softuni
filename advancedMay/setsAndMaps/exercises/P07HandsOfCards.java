package SoftUni.advancedMay.setsAndMaps.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class P07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String name = input.split(": ")[0];
            Set<String> cards = Arrays.stream(input.split(": ")[1].split(",\\s")).collect(Collectors.toCollection(LinkedHashSet::new));

            if (players.containsKey(name)) {
                Set<String> playerCards = players.get(name);
                playerCards.addAll(cards);
            } else {
                players.put(name, cards);
            }
            input = scanner.nextLine();
        }

        players.forEach((name, cards) -> {
            int result = calculatePoints(cards);
            System.out.println(name + ": " + result);
        });
    }

    private static int calculatePoints(Set<String> cards) {
        int total = 0;
        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            String type = card.substring(card.length() - 1);
            int powerToNumber = power.equals("J") ? 11 : power.equals("Q") ? 12 : power.equals("K") ? 13 : power.equals("A") ? 14 : Integer.parseInt(power);
            int multiplier = type.equals("S") ? 4 : type.equals("H") ? 3 : type.equals("D") ? 2 : type.equals("C") ? 1 : -1;
            int result = powerToNumber * multiplier;
            total += result;
        }

        return total;
    }
}
