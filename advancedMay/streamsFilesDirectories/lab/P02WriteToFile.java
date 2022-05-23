package SoftUni.advancedMay.streamsFilesDirectories.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class P02WriteToFile {
    public static void main(String[] args) throws IOException {

        String inputFilePath = "C:\\input.txt";
        String outputFilePath = "D:\\output.txt";
        char[] forbiddenChars = new char[]{',', '.', '!', '?'};
        FileOutputStream fileOutputStream = null;

        try (FileInputStream input = new FileInputStream(inputFilePath)) {
            int oneByte = input.read();
            fileOutputStream = new FileOutputStream(outputFilePath);

            while (oneByte >= 0) {
                if (!containForbiddenChar((char) oneByte, forbiddenChars)) {
                    fileOutputStream.write(oneByte);
                }
                oneByte = input.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
    }

    static boolean containForbiddenChar(char charToCheck, char[] forbiddenChars) {
        for (char forbiddenChar : forbiddenChars) {
            if (charToCheck == forbiddenChar) return true;
        }
        return false;
    }
}
