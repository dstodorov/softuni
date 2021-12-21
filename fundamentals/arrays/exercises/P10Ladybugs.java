package SoftUni.fundamentals.arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P10Ladybugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] usedIndexes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] board = loadGame(fieldSize, usedIndexes);
//        for (int place : board) {
//            System.out.print(place + " ");
//        }
//        System.out.println();

        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("end")) {
            Scanner innerScanner = new Scanner(inputCommand);
            int ladybugStartIndex = Integer.parseInt(innerScanner.next());
            String direction = innerScanner.next();
            int ladybugFlyLength = Integer.parseInt(innerScanner.next());

            boolean ladybugExist = board[ladybugStartIndex] == 1;

            if (ladybugExist) {
                if (direction.equals("left")) {
                    if (ladybugStartIndex - ladybugFlyLength >= 0) {
                        for (int i = ladybugStartIndex - ladybugFlyLength; i >= 0; i -= ladybugFlyLength) {
                            if (i <= board.length -1 && board[i] == 0) {
                                board[i] = 1;
                                break;
                            }
                        }
                    }
                } else if (direction.equals("right")) {
                    if (ladybugStartIndex + ladybugFlyLength <= board.length) {
                        for (int i = ladybugStartIndex + ladybugFlyLength; i < board.length; i += ladybugFlyLength) {
                            if (i >= 0 && i < board.length - 1 && board[i] == 0) {
                                board[i] = 1;
                                break;
                            }
                        }
                    }
                }
                board[ladybugStartIndex] = 0;
            }
            inputCommand = scanner.nextLine();
        }

        for (int place : board) {
            System.out.print(place + " ");
        }
    }

    private static int[] loadGame(int boardSize, int[] initialPlaces) {
        int[] board = new int[boardSize];
        for (int place = 0; place < boardSize; place++) {
            for (int usedPlace : initialPlaces) {
                if (place == usedPlace) {
                    board[place] = 1;
                    break;
                }
            }
        }
        return board;
    }
}
