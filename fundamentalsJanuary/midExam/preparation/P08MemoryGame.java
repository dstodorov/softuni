package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> memoryGame = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        int moves = 0;
        boolean won = false;

        while (!input.equals("end")) {
            List<Integer> indexes = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            moves++;

            if (isPlayerCheating(indexes) || hasIncorrectIndexes(memoryGame, indexes)) {
                String element = String.format("-%da", moves);
                System.out.printf("Invalid input! Adding additional elements to the board%n");
                addAdditionalElements(memoryGame, element);
            } else {
                if (isIndexesMatchNumbers(memoryGame, indexes)) {
                    String element = memoryGame.get(indexes.get(0));
                    removeElements(memoryGame, indexes);
                    System.out.printf("Congrats! You have found matching elements - %s!%n", element);
                } else {
                    System.out.printf("Try again!%n");
                }
            }

            if (memoryGame.size() == 0) {
                won = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (won) {
            System.out.printf("You have won in %d turns!%n", moves);
        } else {
            System.out.printf("Sorry you lose :(%n");
            printGame(memoryGame);
        }
    }

    private static void printGame(List<String> memoryGame) {
        for (String element : memoryGame) {
            System.out.print(element + " ");
        }
    }

    private static void removeElements(List<String> memoryGame, List<Integer> indexes) {
        String elementValue = memoryGame.get(indexes.get(0));
        memoryGame.removeIf(element -> (element.equals(elementValue)));
    }

    private static boolean isIndexesMatchNumbers(List<String> memoryGame, List<Integer> indexes) {
        int indexOne = indexes.get(0);
        int indexTwo = indexes.get(1);
        return memoryGame.get(indexOne).equals(memoryGame.get(indexTwo));
    }

    private static void addAdditionalElements(List<String> memoryGame, String element) {
        int middleIndex = (memoryGame.size()) / 2;
        memoryGame.add(middleIndex, element);
        memoryGame.add(middleIndex, element);
    }

    private static boolean isPlayerCheating(List<Integer> indexes) {
        return indexes.get(0).equals(indexes.get(1));
    }

    private static boolean hasIncorrectIndexes(List<String> memoryGame, List<Integer> indexes) {
        return indexes.get(0) < 0
                || indexes.get(1) < 0
                || indexes.get(0) > memoryGame.size() - 1
                || indexes.get(1) > memoryGame.size() - 1;
    }
}

