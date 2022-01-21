package SoftUni.fundamentalsJanuary.dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (char a = 'a'; a < 'a' + number; a++) {
            for (char b = 'a'; b < 'a' + number; b++) {
                for (char c = 'a'; c < 'a' + number; c++) {
                    System.out.printf("%s%s%s%n", a, b, c);
                }
            }
        }
    }
}
