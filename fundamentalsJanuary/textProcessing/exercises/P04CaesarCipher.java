package SoftUni.fundamentalsJanuary.textProcessing.exercises;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(caesarCipherString(str));
    }

    private static String caesarCipherString(String str) {
        StringBuilder cipheredString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            cipheredString.append(Character.toChars(str.charAt(i) + 3));
        }

        return cipheredString.toString();
    }
}
