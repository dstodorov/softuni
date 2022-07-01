package SoftUni.advancedMay.advanced.streamsFilesDirectories.lab;

import java.io.*;

public class P05WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "D:\\input.txt";
        String outputFilePath = "D:\\output.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(inputFilePath));
             PrintWriter out = new PrintWriter(new FileWriter(outputFilePath))) {
            int lineNumber = 1;

            String line = in.readLine();
            while (line != null) {
                if (lineNumber % 3 == 0) out.println(line);
                lineNumber++;
                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
