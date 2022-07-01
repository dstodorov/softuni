package SoftUni.advancedMay.advanced.streamsFilesDirectories.lab;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class P01ReadFile {
    public static void main(String[] args) {
        String filePath = "C:\\input.txt";

        try(InputStream in = new FileInputStream(filePath)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.print(Integer.toBinaryString(oneByte) + " ");
                oneByte = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
