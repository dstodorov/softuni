package SoftUni.fundamentalsJanuary.textProcessing.exercises;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = scanner.nextLine();

        System.out.println("File name: " + extractFileName(filePath));
        System.out.println("File extension: " + extractFileExtension(filePath));
    }

    private static String extractFileExtension(String filePath) {
        String[] splitted = filePath.split("\\\\+");
        String[] nameAndExtension = splitted[splitted.length - 1].split("\\.");
        return nameAndExtension[1];
    }

    private static String extractFileName(String filePath) {
        String[] splitted = filePath.split("\\\\+");
        String[] nameAndExtension = splitted[splitted.length - 1].split("\\.");
        return nameAndExtension[0];
    }
}
