package SoftUni.advancedMay.streamsFilesDirectories.lab;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class P04ExtractIntegers {
    public static void main(String[] args) {
        String inputFilePath = "D:\\input.txt";

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(inputFilePath);

            int oneByte = inputStream.read();
            StringBuilder sb = new StringBuilder();

            while (oneByte >= 0) {
                sb.append((char) oneByte);

                oneByte = inputStream.read();
            }

            Scanner scanner = new Scanner(sb.toString());

            while (scanner.hasNext()) {
                if(scanner.hasNextInt()) System.out.println(scanner.nextInt());
                scanner.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
