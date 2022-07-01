package SoftUni.advancedMay.advanced.streamsFilesDirectories.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class P06WordCount {
    public static void main(String[] args) throws IOException {

        String mainFilepath = "D:\\Files-and-streams\\Exercises Resources\\text.txt";
        BufferedReader mainFileReader = new BufferedReader(new FileReader(mainFilepath));
        Map<String, Integer> words = new LinkedHashMap<>();
        String line = mainFileReader.readLine();

        while (line != null) {
            String[] lineWords = line.split("\\s");

            Arrays.stream(lineWords).forEach(word -> {
                if (words.containsKey(word)) {
                    words.put(word, words.get(word) + 1);
                } else {
                    words.put(word, 1);
                }
            });

            line = mainFileReader.readLine();
        }
        mainFileReader.close();

        String searchedWordFilepath = "D:\\Files-and-streams\\Exercises Resources\\words.txt";
        String resultsFilepath = "D:\\Files-and-streams\\Exercises Resources\\results.txt";
        BufferedReader searchedWordsFileReader = new BufferedReader(new FileReader(searchedWordFilepath));
        FileWriter writer = new FileWriter(resultsFilepath);
        Map<String, Integer> results = new LinkedHashMap<>();

        line = searchedWordsFileReader.readLine();

        while (line != null) {
            String[] searchedWords = line.split("\\s");

            Arrays.stream(searchedWords).forEach(word -> {
                if (words.containsKey(word)) {
                    results.put(word, words.get(word));
                }
            });

            line = searchedWordsFileReader.readLine();
        }
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        results.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        reverseSortedMap.forEach((key, value) -> {
            try {
                writer.write(key + " - " + value + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.flush();
    }
}
