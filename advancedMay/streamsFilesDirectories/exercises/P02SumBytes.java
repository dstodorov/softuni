package SoftUni.advancedMay.streamsFilesDirectories.exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class P02SumBytes {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "C:\\Users\\E0012357\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        BigInteger bi = new BigInteger("0");
        String line = reader.readLine();

        while (line != null) {
            int sumLineCharsAsciiCodes = getAsciiCodesSum(line);
            bi = bi.add(new BigInteger(String.valueOf(sumLineCharsAsciiCodes)));
            line = reader.readLine();
        }

        System.out.println(bi);
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