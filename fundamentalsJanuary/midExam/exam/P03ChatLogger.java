package SoftUni.fundamentalsJanuary.midExam.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chatMessages = new ArrayList<>();

        String rawInput = scanner.nextLine();

        while (!rawInput.equals("end")) {
            String[] inputCommands = rawInput.split(" ");
            String command = inputCommands[0];


            if (command.equals("Chat")) {
                String message = inputCommands[1];
                addMessage(chatMessages, message);
            } else if (command.equals("Delete")) {
                String message = inputCommands[1];
                if (isMessageExist(chatMessages, message)) {
                    deleteMessage(chatMessages, message);
                }
            } else if (command.equals("Edit")) {
                String message = inputCommands[1];
                String editedVersion = inputCommands[2];

                if (isMessageExist(chatMessages, message)) {
                    editMessage(chatMessages, message, editedVersion);
                }

            } else if (command.equals("Pin")) {
                String message = inputCommands[1];

                if (isMessageExist(chatMessages, message)) {
                    pinMessage(chatMessages, message);
                }
            } else if (command.equals("Spam")) {
                String[] messages = inputCommands;
                addSpamMessages(chatMessages, messages);
            }


            rawInput = scanner.nextLine();
        }

        printLog(chatMessages);
    }

    private static void addSpamMessages(List<String> chatMessages, String[] messages) {
        for (int i = 1; i < messages.length; i++) {
            chatMessages.add(messages[i]);
        }
    }

    private static void pinMessage(List<String> chatMessages, String message) {
        chatMessages.remove(message);
        chatMessages.add(message);
    }

    private static void editMessage(List<String> chatMessages, String message, String editedVersion) {
        int messageIndex = chatMessages.indexOf(message);
        chatMessages.set(messageIndex, editedVersion);
    }

    private static void deleteMessage(List<String> chatMessages, String message) {
        chatMessages.remove(message);
    }

    private static boolean isMessageExist(List<String> chatMessages, String message) {
        return chatMessages.contains(message);
    }

    private static void printLog(List<String> chatMessages) {
        for (String message : chatMessages) {
            System.out.println(message);
        }
    }

    private static void addMessage(List<String> chatMessages, String message) {
        chatMessages.add(message);
    }
}
