package SoftUni.advancedMay.advanced.streamsFilesDirectories.exercises;

import java.io.*;

public class P01SumLines {
    public static void main(String[] args) throws IOException {

        String inputFilePath = "C:\\Users\\E0012357\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));

        String line = reader.readLine();

        while (line != null) {
            int sumLineCharsAsciiCodes = getAsciiCodesSum(line);
            System.out.println(sumLineCharsAsciiCodes);
            line = reader.readLine();
        }

    }

    private static int getAsciiCodesSum(String line) {
        int sum = 0;

        for (int i = 0; i < line.length(); i++) {
            int asciiCode = line.charAt(i);
            sum += asciiCode;
        }

        return sum;

    }
}