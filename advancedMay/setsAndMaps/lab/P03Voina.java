package SoftUni.advancedMay.setsAndMaps.lab;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class P03Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> playerOneCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> playerTwoCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        int game = 1;
        while (game <= 50) {
            if (playerOneCards.size() == 0){
                System.out.println("Second player win!");
                break;
            }
            if (playerTwoCards.size() == 0) {
                System.out.println("First player win!");
                break;
            }

            Integer firstPlayerCard = playerOneCards.iterator().next();
            Integer secondPlayerCard = playerTwoCards.iterator().next();
            playerOneCards.remove(firstPlayerCard);
            playerTwoCards.remove(secondPlayerCard);

            if(firstPlayerCard > secondPlayerCard) {
                playerOneCards.add(firstPlayerCard);
                playerOneCards.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                playerTwoCards.add(firstPlayerCard);
                playerTwoCards.add(secondPlayerCard);
            }

            game++;
        }
        if (playerOneCards.size() == playerTwoCards.size()) System.out.println("Draw!");
        else if (playerOneCards.size() > playerTwoCards.size()) System.out.println("First player win!");
        else System.out.println("Second player win!");
    }
}
