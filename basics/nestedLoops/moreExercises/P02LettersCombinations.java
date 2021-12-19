package SoftUni.basics.nestedLoops.moreExercises;

import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstChar = scanner.nextLine();
        String lastChar = scanner.nextLine();
        String charToSkip = scanner.nextLine();
        int combinations = 0;

        for (char first = firstChar.charAt(0); first <= lastChar.charAt(0); first++) {
            for (char second = firstChar.charAt(0); second <= lastChar.charAt(0); second++) {
                for (char third = firstChar.charAt(0); third <= lastChar.charAt(0); third++) {
                    boolean isValidSequence = first == charToSkip.charAt(0) || second == charToSkip.charAt(0) || third == charToSkip.charAt(0);
                    if (!isValidSequence) {
                        combinations++;
                        System.out.printf("%s%s%s ", first, second, third);
                    }
                }
            }
        }
        System.out.print(combinations);
    }
}
