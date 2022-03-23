package SoftUni.fundamentalsJanuary.textProcessing.moreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.Map.entry;

public class P04MorseCodeTranslator {
    public static void main(String[] args) {

        Map<String, String> morseAlphabet = Map.ofEntries(
                entry(".-", "A"),
                entry("-...", "B"),
                entry("-.-.", "C"),
                entry("-..", "D"),
                entry(".", "E"),
                entry("..-.", "F"),
                entry("--.", "G"),
                entry("....", "H"),
                entry("..", "I"),
                entry(".---", "J"),
                entry("-.-", "K"),
                entry(".-..", "L"),
                entry("--", "M"),
                entry("-.", "N"),
                entry("---", "O"),
                entry(".--.", "P"),
                entry("--.-", "Q"),
                entry(".-.", "R"),
                entry("...", "S"),
                entry("-", "T"),
                entry("..-", "U"),
                entry("...-", "V"),
                entry(".--", "W"),
                entry("-..-", "X"),
                entry("-.--", "Y"),
                entry("--..", "Z")
        );

        Scanner scanner = new Scanner(System.in);

        String sentenceInMorseCode = scanner.nextLine();

        int startIndex = 0;
        int nextIndex = sentenceInMorseCode.indexOf("|");
        StringBuilder outputMessage = new StringBuilder();

        while (nextIndex != -1) {
            String wordInMorse = sentenceInMorseCode.substring(startIndex, nextIndex);
            String[] lettersInMorse = wordInMorse.split(" ");
            for (int i = 0; i < lettersInMorse.length; i++) {
                String symbol = lettersInMorse[i];
                if (symbol.equals("|")) outputMessage.append(" ");
                else outputMessage.append(morseAlphabet.get(symbol));
            }
            startIndex = nextIndex;
            nextIndex = sentenceInMorseCode.indexOf("|", startIndex + 1);
        }
        String wordInMorse = sentenceInMorseCode.substring(startIndex);
        String[] lettersInMorse = wordInMorse.split(" ");

        for (int i = 0; i < lettersInMorse.length; i++) {
            String symbol = lettersInMorse[i];
            if (symbol.equals("|")) outputMessage.append(" ");
            else outputMessage.append(morseAlphabet.get(symbol));
        }
        System.out.println(outputMessage);
    }
}
