package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder encryptedMessage = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {

            String[] instructions = input.split("\\|");

            switch (instructions[0]) {
                case "Move":
                    moveLetters(encryptedMessage, Integer.parseInt(instructions[1]));
                    break;
                case "Insert":
                    insertLetters(encryptedMessage, Integer.parseInt(instructions[1]), instructions[2]);
                    break;
                case "ChangeAll":
                    changeAllOccurrences(encryptedMessage, instructions[1], instructions[2]);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", encryptedMessage);
    }

    private static void changeAllOccurrences(StringBuilder encryptedMessage, String substring, String replacement) {
        int index = encryptedMessage.indexOf(substring);

        while (index != -1) {
            encryptedMessage.replace(index, index + substring.length(), replacement);
            index = encryptedMessage.indexOf(substring, index);
        }
    }

    private static void insertLetters(StringBuilder encryptedMessage, int index, String value) {
        encryptedMessage.insert(index, value);
    }

    private static void moveLetters(StringBuilder encryptedMessage, int numberOfLetters) {
        for (int i = 0; i < numberOfLetters; i++) {
            encryptedMessage.append(encryptedMessage.charAt(0));
            encryptedMessage.deleteCharAt(0);
        }
    }
}
