package SoftUni.advancedMay.streamsFilesDirectories.exercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P09CopyAPicture {
    public static void main(String[] args) throws IOException {
        String inputPath = "D:\\cry-baby.jpg";
        String outputPath = "D:\\cry-baby-copy.jpg";

        FileInputStream inputStream = new FileInputStream(inputPath);
        FileOutputStream outputStream = new FileOutputStream(outputPath);
        File inputFile = new File(inputPath);
        int oneByte = inputStream.read();
        int[] bytes = new int[(int)inputFile.length()];

        int byteNumber = 0;
        while (oneByte != -1) {
            bytes[byteNumber] = oneByte;
            byteNumber++;
            oneByte = inputStream.read();
        }

        for (int aByte : bytes) {
            outputStream.write(aByte);
        }
    }
}
