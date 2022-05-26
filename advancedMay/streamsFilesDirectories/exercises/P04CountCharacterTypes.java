package SoftUni.advancedMay.streamsFilesDirectories.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P04CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String inputFilePath = "C:\\Users\\E0012357\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputFilePath = "C:\\Users\\E0012357\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        FileWriter writer = new FileWriter(outputFilePath);

        String line = reader.readLine();

        int vowels = 0;
        int consonants = 0;
        int punctuations = 0;

        while (line != null) {

            vowels += getVowelsCount(line);
            consonants += getConsonantsCount(line);
            punctuations += getPunctuationsCount(line);
            line = reader.readLine();
        }

        writer.write("Vowels: " + vowels + "\n" + "Consonants: " + consonants + "\n" + "Punctuation: " + punctuations);

        writer.close();
    }

    private static int getPunctuationsCount(String line) {
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '!' || c == ',' || c == '.' || c == '?' || c == '(' || c == ')') sum++;
        }

        return sum;
    }

    private static int getConsonantsCount(String line) {
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != ' ' && c != '!' && c != ',' && c != '.' && c != '?')
                sum++;
        }

        return sum;
    }

    private static int getVowelsCount(String line) {
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') sum++;
        }

        return sum;
    }
}