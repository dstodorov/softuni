package SoftUni.advancedMay.streamsFilesDirectories.exercises;

import java.io.*;
import java.util.Locale;

public class P03AllCapitals {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "C:\\Users\\E0012357\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputFilePath = "C:\\Users\\E0012357\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        FileWriter writer = new FileWriter(outputFilePath);

        String line = reader.readLine();

        while (line != null) {
            writer.write(line.toUpperCase());
            writer.write("\n");
            line = reader.readLine();
        }

        writer.close();
    }
}