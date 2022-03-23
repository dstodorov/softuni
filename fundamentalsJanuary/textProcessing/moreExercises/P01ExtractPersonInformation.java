package SoftUni.fundamentalsJanuary.textProcessing.moreExercises;

import java.util.Scanner;

public class P01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String line = scanner.nextLine();

            String name = getName(line);
            int age = getAge(line);

            System.out.printf("%s is %d years old.%n", name, age);
        }
    }

    private static int getAge(String line) {
        int startIndex = line.indexOf("#") + 1;
        int endIndex = line.indexOf("*");

        return Integer.parseInt(line.substring(startIndex, endIndex));
    }

    private static String getName(String line) {
        int startIndex = line.indexOf("@") + 1;
        int endIndex = line.indexOf("|");

        return line.substring(startIndex, endIndex);
    }
}
