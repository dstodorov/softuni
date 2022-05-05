package SoftUni.advancedMay.multidimensionalArrays.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int rotationDegrees = getRotationDegrees(command);
        List<String> strings = getStrings(scanner);
        String[][] matrix = fillMatrix(strings);
        int rotations = rotationDegrees / 90;

        while (rotations > 0) {
            matrix = rotateMatrix(matrix);
            rotations--;
        }

        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static String[][] rotateMatrix(String[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        String[][] rotatedMatrix;

        rotatedMatrix = new String[cols][rows];
        for (int row = 0; row < rotatedMatrix.length; row++) {
            for (int col = 0; col < rotatedMatrix[row].length; col++) {
                rotatedMatrix[row][col] = matrix[matrix.length - 1 - col][row];
            }
        }

        matrix = rotatedMatrix;

        return matrix;
    }

    private static String[][] fillMatrix(List<String> strings) {
        int rows = strings.size();
        int cols = getMaxChars(strings);
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (strings.get(row).length() - 1 < col) {
                    matrix[row][col] = " ";
                } else {
                    matrix[row][col] = String.valueOf(strings.get(row).charAt(col));
                }
            }
        }
        return matrix;
    }

    private static int getMaxChars(List<String> strings) {
        int maxChars = 0;
        for (String str : strings) {
            if (str.length() > maxChars) maxChars = str.length();
        }
        return maxChars;
    }

    private static List<String> getStrings(Scanner scanner) {
        List<String> strings = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            strings.add(input);
            input = scanner.nextLine();
        }

        return strings;
    }

    private static int getRotationDegrees(String command) {
        Pattern degreesPattern = Pattern.compile("\\d+");
        Matcher matcher = degreesPattern.matcher(command);

        int rotationDegrees = 0;
        if (matcher.find()) {
            rotationDegrees = Integer.parseInt(matcher.group());
        }
        return rotationDegrees;
    }
}
