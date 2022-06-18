package SoftUni.advancedMay.examPreparation.exam02;

import java.util.Scanner;
///////NOT AN ELEGANT WAY TO SOLVE THE PROBLEM BUT IT WORKS
public class P02PawnWars {
    private static String[][] cells;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] board = new String[8][8];
        int[] whitePosition = new int[2];
        int[] blackPosition = new int[2];

        int i = 0;
        cells = new String[8][8];
        for (int row = 8; row >= 1; row--) {
            int j = 0;
            for (int col = 0; col < 8; col++) {
                cells[i][j] = String.valueOf((char) (col + 97)) + row;
                j++;
            }
            i++;
        }
        for (int row = 0; row < board.length; row++) {
            String line = scanner.nextLine();
            int index = 0;
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = String.valueOf(line.charAt(index));
                if (board[row][col].equals("b")) {
                    blackPosition[0] = row;
                    blackPosition[1] = col;
                } else if (board[row][col].equals("w")) {
                    whitePosition[0] = row;
                    whitePosition[1] = col;
                }
                index++;
            }
        }

        boolean whiteWins = false;
        boolean blackWins = false;
        do {
            whiteWins = moveWhite(whitePosition, board);
            if (whiteWins) break;
            blackWins = moveBlack(blackPosition, board);
            if (blackWins) break;
        } while (true);
    }

    private static boolean moveWhite(int[] pawnPosition, String[][] board) {
        //проверяваме за край на дъската
        if (pawnPosition[0] - 1 < 0) {
            System.out.printf("Game over! White pawn is promoted to a queen at %s.%n", cells[pawnPosition[0]][pawnPosition[1]]);
            return true;
        }
        //Проверяваме диагоналите за противниковата пешка
        boolean leftEdge = pawnPosition[1] == 0;
        boolean rightEdge = pawnPosition[1] == 7;

        if (leftEdge) {
            if (board[pawnPosition[0] - 1][pawnPosition[1] + 1].equals("b")) {
                board[pawnPosition[0] - 1][pawnPosition[1] + 1] = "b";
                board[pawnPosition[0]][pawnPosition[1]] = "-";
                pawnPosition[0] -= 1;
                pawnPosition[1] += 1;
                System.out.printf("Game over! White capture on %s.%n", cells[pawnPosition[0]][pawnPosition[1]]);
                return true;
            }
            board[pawnPosition[0]][pawnPosition[1]] = "-";
            board[pawnPosition[0] - 1][pawnPosition[1]] = "w";
            pawnPosition[0] -= 1;
            return false;
        } else if (rightEdge) {
            if (board[pawnPosition[0] - 1][pawnPosition[1] - 1].equals("b")) {
                board[pawnPosition[0] - 1][pawnPosition[1] - 1] = "w";
                board[pawnPosition[0]][pawnPosition[1]] = "-";
                pawnPosition[0] -= 1;
                pawnPosition[1] -= 1;
                System.out.printf("Game over! White capture on %s.%n", cells[pawnPosition[0]][pawnPosition[1]]);
                return true;
            }
            board[pawnPosition[0]][pawnPosition[1]] = "-";
            board[pawnPosition[0] - 1][pawnPosition[1]] = "w";
            pawnPosition[0] -= 1;
            return false;
        } else if (board[pawnPosition[0] - 1][pawnPosition[1] + 1].equals("b")){
            board[pawnPosition[0] - 1][pawnPosition[1] + 1] = "b";
            board[pawnPosition[0]][pawnPosition[1]] = "-";
            pawnPosition[0] -= 1;
            pawnPosition[1] += 1;
            System.out.printf("Game over! White capture on %s.%n", cells[pawnPosition[0]][pawnPosition[1]]);
            return true;
        } else if (board[pawnPosition[0] - 1][pawnPosition[1] - 1].equals("b")) {
            board[pawnPosition[0] - 1][pawnPosition[1] - 1] = "w";
            board[pawnPosition[0]][pawnPosition[1]] = "-";
            pawnPosition[0] -= 1;
            pawnPosition[1] -= 1;
            System.out.printf("Game over! White capture on %s.%n", cells[pawnPosition[0]][pawnPosition[1]]);
            return true;
        }
        board[pawnPosition[0]][pawnPosition[1]] = "-";
        board[pawnPosition[0] - 1][pawnPosition[1]] = "w";
        pawnPosition[0] -= 1;
        return false;
    }

    private static boolean moveBlack(int[] pawnPosition, String[][] board) {
        //проверяваме за край на дъската
        if (pawnPosition[0] + 1 == board.length) {
            System.out.printf("Game over! Black pawn is promoted to a queen at %s.%n", cells[pawnPosition[0]][pawnPosition[1]]);
            return true;
        }
        //Проверяваме диагоналите за противниковата пешка
        boolean leftEdge = pawnPosition[1] == 0;
        boolean rightEdge = pawnPosition[1] == 7;

        if (leftEdge) {
            if (board[pawnPosition[0] + 1][pawnPosition[1] + 1].equals("w")) {
                board[pawnPosition[0] + 1][pawnPosition[1] + 1] = "b";
                board[pawnPosition[0]][pawnPosition[1]] = "-";
                pawnPosition[0] += 1;
                pawnPosition[1] += 1;
                System.out.printf("Game over! Black capture on %s.%n", cells[pawnPosition[0]][pawnPosition[1]]);
                return true;
            }
            board[pawnPosition[0]][pawnPosition[1]] = "-";
            board[pawnPosition[0] + 1][pawnPosition[1]] = "b";
            pawnPosition[0] += 1;
            return false;
        } else if (rightEdge) {
            if (board[pawnPosition[0] + 1][pawnPosition[1] - 1].equals("w")) {
                board[pawnPosition[0] + 1][pawnPosition[1] - 1] = "b";
                board[pawnPosition[0]][pawnPosition[1]] = "-";
                pawnPosition[0] += 1;
                pawnPosition[1] -= 1;
                System.out.printf("Game over! Black capture on %s.%n", cells[pawnPosition[0]][pawnPosition[1]]);
                return true;
            }
            board[pawnPosition[0]][pawnPosition[1]] = "-";
            board[pawnPosition[0] + 1][pawnPosition[1]] = "b";
            pawnPosition[0] += 1;
            return false;
        } else if (board[pawnPosition[0] + 1][pawnPosition[1] + 1].equals("w")) {
            board[pawnPosition[0] + 1][pawnPosition[1] + 1] = "b";
            board[pawnPosition[0]][pawnPosition[1]] = "-";
            pawnPosition[0] += 1;
            pawnPosition[1] += 1;
            System.out.printf("Game over! Black capture on %s.%n", cells[pawnPosition[0]][pawnPosition[1]]);
            return true;
        } else if (board[pawnPosition[0] + 1][pawnPosition[1] - 1].equals("w")) {
            board[pawnPosition[0] + 1][pawnPosition[1] - 1] = "b";
            board[pawnPosition[0]][pawnPosition[1]] = "-";
            pawnPosition[0] += 1;
            pawnPosition[1] -= 1;
            System.out.printf("Game over! Black capture on %s.%n", cells[pawnPosition[0]][pawnPosition[1]]);
            return true;
        }
        board[pawnPosition[0]][pawnPosition[1]] = "-";
        board[pawnPosition[0] + 1][pawnPosition[1]] = "b";
        pawnPosition[0] += 1;
        return false;
    }

}
