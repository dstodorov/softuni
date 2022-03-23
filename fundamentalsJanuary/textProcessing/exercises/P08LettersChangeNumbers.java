package SoftUni.fundamentalsJanuary.textProcessing.exercises;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputStrings = scanner.nextLine().split("\\s+");

        double totalSum = 0;

        for (String str : inputStrings) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            int number = Integer.parseInt(str.substring(1, str.length() - 1));

            int positionInAlphabetForFirstChar = getPositionInAlphabet(firstChar);
            int positionInAlphabetForLastChar = getPositionInAlphabet(lastChar);
            double resultedNumber = 0;
            if (Character.isUpperCase(firstChar)) {
                resultedNumber += (double) number / positionInAlphabetForFirstChar;
            } else if (Character.isLowerCase(firstChar)) {
                resultedNumber += (double) number * positionInAlphabetForFirstChar;
            }
            if (Character.isUpperCase(lastChar)) {
                resultedNumber -= positionInAlphabetForLastChar;
            } else if (Character.isLowerCase(lastChar)) {
                resultedNumber += positionInAlphabetForLastChar;
            }

            totalSum += resultedNumber;
        }

        System.out.printf("%.2f%n", totalSum);
    }

    private static int getPositionInAlphabet(char symbol) {
        return Character.isLowerCase(symbol) ? Character.hashCode(symbol) - 96 : Character.hashCode(symbol) - 64;
    }
}
