package SoftUni.advancedMay.streamsFilesDirectories.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class P06SortLines {
    public static void main(String[] args) throws IOException {
        Path inputFilePath = Paths.get("D:\\input.txt");
        Path outputFilePath = Paths.get("D:\\output.txt");

        List<String> lines = Files.readAllLines(inputFilePath);
        Collections.sort(lines);
        Files.write(outputFilePath, lines);
    }
}
