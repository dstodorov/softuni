package SoftUni.fundamentalsJanuary.methods.exercises;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char from = scanner.nextLine().charAt(0);
        char to = scanner.nextLine().charAt(0);
        char[] symbolsBetween = getCharactersBetween(from, to);

        for (int i = 1; i < symbolsBetween.length; i++) {
            System.out.print(symbolsBetween[i] + " ");
        }

    }

    private static char[] getCharactersBetween(char from, char to) {
        int numberOfElements = Math.abs((int)to - (int)from);
        char[] result = new char[numberOfElements];
        int counter = 0;
        if (from > to) {
            for (char i = to; i < from; i++) {
                result[counter] = i;
                counter++;
            }
        } else {
            for (char i = from; i < to; i++) {
                result[counter] = i;
                counter++;
            }
        }
        return result;
    }
}
