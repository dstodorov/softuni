package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.Locale;
import java.util.Scanner;

public class P13ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder key = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] inputCommands = input.split(">>>");

            switch (inputCommands[0]) {
                case "Contains": {
                    if (key.indexOf(inputCommands[1]) != -1) {
                        System.out.println(key + " contains " + inputCommands[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                }
                case "Flip": {
                    flipLettersCaseBetween(key, inputCommands[1], Integer.parseInt(inputCommands[2]), Integer.parseInt(inputCommands[3]));
                    System.out.println(key);
                    break;
                }
                case "Slice": {
                    slice(key, Integer.parseInt(inputCommands[1]), Integer.parseInt(inputCommands[2]));
                    System.out.println(key);
                    break;
                }
            }
            input = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + key);
    }

    private static void slice(StringBuilder key, int fromIndex, int toIndex) {
        key.delete(fromIndex, toIndex);
    }

    private static void flipLettersCaseBetween(StringBuilder key, String inputCase, int fromIndex, int toIndex) {
        String substr = inputCase.equals("Lower") ? key.substring(fromIndex, toIndex).toLowerCase() : inputCase.equals("Upper") ? key.substring(fromIndex, toIndex).toUpperCase() : key.substring(fromIndex, toIndex);
        key.replace(fromIndex, toIndex, substr);
    }
}
