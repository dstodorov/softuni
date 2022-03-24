package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.Scanner;

public class P07SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] inputCommands = input.split(":\\|:");

            if (inputCommands[0].equals("InsertSpace")) {
                addSpace(message, Integer.parseInt(inputCommands[1]));
                System.out.println(message);
            } else if (inputCommands[0].equals("Reverse")) {
                if (message.indexOf(inputCommands[1]) != -1) {
                    reverse(message, inputCommands[1]);
                    System.out.println(message);
                } else {
                    System.out.println("error");
                }
            } else if (inputCommands[0].equals("ChangeAll")) {
                changeAll(message, inputCommands[1], inputCommands[2]);
                System.out.println(message);
            }

            input = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }

    private static void changeAll(StringBuilder message, String fromTxt, String toTxt) {
        int index = message.indexOf(fromTxt);

        while (index != -1) {
            message.replace(index, index + fromTxt.length(), toTxt);
            index = message.indexOf(fromTxt, index + toTxt.length());
        }

    }

    private static void reverse(StringBuilder message, String substr) {
        StringBuilder reversedMessage = new StringBuilder();
        String subMessage = message.substring(message.indexOf(substr), message.indexOf(substr) + substr.length());
        message.delete(message.indexOf(substr), message.indexOf(substr) + substr.length());

        for (int i = subMessage.length() - 1; i >= 0; i--) {
            reversedMessage.append(subMessage.charAt(i));
        }
        message.append(reversedMessage);
    }

    private static void addSpace(StringBuilder message, int index) {
        message.insert(index, " ");
    }
}
