package SoftUni.advancedMay.streamsFilesDirectories.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P05LineNumbers {
    public static void main(String[] args) throws IOException {


        String inputFilePath = "C:\\Users\\E0012357\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String outputFilePath = "C:\\Users\\E0012357\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        FileWriter writer = new FileWriter(outputFilePath);

        String line = reader.readLine();

        int lineNumber = 1;

        while (line != null) {
            writer.write(lineNumber +". " + line + "\n");
            lineNumber++;
            line = reader.readLine();
        }

        reader.close();
        writer.close();
    }
}
