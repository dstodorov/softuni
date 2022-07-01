package SoftUni.advancedMay.advanced.examPreparation.exam05;

import java.util.Scanner;

public class P02FormulaOne {
    private static int playerPosX;
    private static int playerPosY;
    private static boolean playerWin = false;
    private static int finalPosX;
    private static int finalPosY;
    private static boolean bonusWasHit = false;
    private static String command;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        char[][] track = new char[size][size];

        for (int row = 0; row < track.length; row++) {
            String line = scanner.nextLine();
            track[row] = line.toCharArray();

            if (line.contains("P")) {
                playerPosX = row;
                playerPosY = line.indexOf("P");
            }
            if (line.contains("F")) {
                finalPosX = row;
                finalPosY = line.indexOf("F");
            }
        }

        for (int i = 0; i < numberOfCommands; i++) {
            command = scanner.nextLine();

            switch (command) {
                case "up":
                    if (playerPosX - 1 < 0) {
                        move(track, size - 1, 0);
                    } else {
                        move(track, -1, 0);
                    }
                    break;
                case "down":
                    if (playerPosX + 1 > track.length - 1) {
                        move(track, -playerPosX, 0);
                    } else {
                        move(track, 1, 0);
                    }
                    break;
                case "left":
                    if (playerPosY - 1 < 0) {
                        move(track, 0, size - 1);
                    } else {
                        move(track, 0, -1);
                    }
                    break;
                case "right":
                    if (playerPosY + 1 > track.length - 1) {
                        move(track, 0, -playerPosY);
                    } else {
                        move(track, 0, 1);
                    }
                    break;
            }
            if (playerWin) break;
        }
        if (playerWin) {
            System.out.println("Well done, the player won first place!");
        } else {
            System.out.println("Oh no, the player got lost on the track!");
        }

        print2DArray(track);


    }

    private static void print2DArray(char[][] track) {
        for (int row = 0; row < track.length; row++) {
            for (int col = 0; col < track[row].length; col++) {
                System.out.print(track[row][col]);
            }
            System.out.println();
        }
    }

    private static void move(char[][] track, int rowMutator, int colMutator) {
        int nextRow = playerPosX + rowMutator;
        int nextCol = playerPosY + colMutator;

        boolean foundTrap = false;
        boolean foundBonus = false;

        if (track[nextRow][nextCol] == 'T') {
            foundTrap = true;
        } else if (track[nextRow][nextCol] == 'F') {
            playerWin = true;
        } else if (track[nextRow][nextCol] == 'B') {
            foundBonus = true;
        }

        if (!foundTrap && !foundBonus) {
            if (!bonusWasHit) {
                track[playerPosX][playerPosY] = '.';
                track[nextRow][nextCol] = 'P';
            } else {
                track[nextRow][nextCol] = 'P';
                bonusWasHit = false;
            }
            playerPosX = nextRow;
            playerPosY = nextCol;
        }
        if (foundBonus) {
            track[playerPosX][playerPosY] = '.';
            if (command.equals("up")) {
                if (nextRow == 0) {
                    playerPosX = track.length;
                    playerPosY = nextCol;
                }
            } else if (command.equals("down")) {
                if (nextRow == track.length - 1) {
                    playerPosX = track.length - 2 - nextRow;
                    playerPosY = nextCol;
                }
            } else if (command.equals("left")) {
                if (nextCol == 0) {
                    playerPosX = nextRow;
                    playerPosY = track.length;
                }
            } else if (command.equals("right")) {
                if (nextCol == track.length -1) {
                    playerPosX = nextRow;
                    playerPosY = track.length - 2 - nextCol;
                }
            } else {
                playerPosX = nextRow;
                playerPosY = nextCol;
            }
            bonusWasHit = true;
            move(track, rowMutator, colMutator);
        }
    }
}
