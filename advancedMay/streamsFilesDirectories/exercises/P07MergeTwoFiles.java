package SoftUni.advancedMay.streamsFilesDirectories.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P07MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String fileOnePath = "D:\\Files-and-streams\\inputOne.txt";
        String fileTwoPath = "D:\\Files-and-streams\\inputTwo.txt";
        String mergedFilepath = "D:\\Files-and-streams\\mergedFile.txt";
        BufferedReader readerFileOne = new BufferedReader(new FileReader(fileOnePath));
        BufferedReader readerFileTwo = new BufferedReader(new FileReader(fileTwoPath));
        FileWriter writer = new FileWriter(mergedFilepath);

        String line = readerFileOne.readLine();
        while (line != null) {
            writer.write(line + "\n");
            line = readerFileOne.readLine();
        }

        line = readerFileTwo.readLine();
        while (line != null) {
            writer.write(line + "\n");
            line = readerFileTwo.readLine();
        }
        writer.close();
    }
}
