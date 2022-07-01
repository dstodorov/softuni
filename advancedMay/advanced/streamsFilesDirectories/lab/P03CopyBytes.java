package SoftUni.advancedMay.advanced.streamsFilesDirectories.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P03CopyBytes {
    public static void main(String[] args) throws IOException {

        String inputFilePath = "D:\\input.txt";
        String outputFilePath = "D:\\output.txt";

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(inputFilePath);
            outputStream = new FileOutputStream(outputFilePath);

            int oneByte = inputStream.read();

            while (oneByte >= 0) {

                if ((char) oneByte == ' ' || (char) oneByte == '\n') {
                    outputStream.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);

                    for (int i = 0; i < digits.length(); i++) {
                        outputStream.write(digits.charAt(i));
                    }
                }

                oneByte = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) inputStream.close();
            if (outputStream != null) outputStream.close();
        }
    }
}
