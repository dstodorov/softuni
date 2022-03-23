package SoftUni.fundamentalsJanuary.textProcessing.moreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] key = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();


        while (!input.equals("find")) {
            StringBuilder decryptedMessage = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                int currentCharKey = i % key.length;
                int charAsciiCode = input.charAt(i);
                charAsciiCode -= key[currentCharKey];
                decryptedMessage.append((char) charAsciiCode);
            }

            String treasureType = getTreasureType(decryptedMessage);
            String treasureCoordinates = getTreasureCoordinated(decryptedMessage);
            System.out.printf("Found %s at %s%n", treasureType, treasureCoordinates);

            input = scanner.nextLine();
        }
    }

    private static String getTreasureCoordinated(StringBuilder decryptedMessage) {
        int startIndex = decryptedMessage.indexOf("<");
        int endIndex = decryptedMessage.lastIndexOf(">");

        return decryptedMessage.substring(startIndex + 1, endIndex);
    }

    private static String getTreasureType(StringBuilder decryptedMessage) {
        int startIndex = decryptedMessage.indexOf("&");
        int endIndex = decryptedMessage.lastIndexOf("&");

        return decryptedMessage.substring(startIndex + 1, endIndex);
    }
}
