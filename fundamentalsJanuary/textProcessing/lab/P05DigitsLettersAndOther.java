package SoftUni.fundamentalsJanuary.textProcessing.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
              digits.append(text.charAt(i));
            } else if (Character.isLetter(text.charAt(i))) {
                letters.append(text.charAt(i));
            } else {
                symbols.append(text.charAt(i));
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
