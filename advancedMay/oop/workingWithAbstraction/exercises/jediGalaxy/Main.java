package SoftUni.advancedMay.oop.workingWithAbstraction.exercises.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] galaxy = new int[rows][cols];

        fillGalaxy(rows, cols, galaxy);

        String command = scanner.nextLine();
        long collectedStars = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] playerCoordinates = Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int[] evilCoordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            int evilPositionX = evilCoordinates[0];
            int evilPositionY = evilCoordinates[1];

            destroyStars(galaxy, evilPositionX, evilPositionY);

            int playerPositionX = playerCoordinates[0];
            int playerPositionY = playerCoordinates[1];

            collectedStars = collectStars(galaxy, collectedStars, playerPositionX, playerPositionY);

            command = scanner.nextLine();
        }

        System.out.println(collectedStars);


    }

    private static long collectStars(int[][] matrix, long sum, int playerPositionX, int playerPositionY) {
        while (playerPositionX >= 0 && playerPositionY < matrix[1].length) {
            if (playerPositionX < matrix.length && playerPositionY >= 0 && playerPositionY < matrix[0].length) {
                sum += matrix[playerPositionX][playerPositionY];
            }

            playerPositionY++;
            playerPositionX--;
        }
        return sum;
    }

    private static void destroyStars(int[][] matrix, int evilPositionX, int evilPositionY) {
        while (evilPositionX >= 0 && evilPositionY >= 0) {
            if (evilPositionX < matrix.length && evilPositionY < matrix[0].length) {
                matrix[evilPositionX][evilPositionY] = 0;
            }
            evilPositionX--;
            evilPositionY--;
        }
    }

    private static void fillGalaxy(int x, int y, int[][] matrix) {
        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = value++;
            }
        }
    }
}
