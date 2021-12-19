package SoftUni.fundamentals.dataTypesAndVariables.moreExercises;

import java.util.Scanner;

public class P01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            Scanner type = new Scanner(input);
            if (type.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", input);
                type.close();
            } else if (type.hasNextInt()) {
                System.out.printf("%s is integer type%n", input);
                type.close();
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
                type.close();
            } else if (type.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", input);
                type.close();
            } else if (type.hasNextLine()) {
                System.out.printf("%s is string type%n", input);
                type.close();
            }
            input = scanner.nextLine();
        }
    }
}
