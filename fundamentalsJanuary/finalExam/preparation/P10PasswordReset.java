package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.Scanner;

public class P10PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] inputCommands = input.split("\\s");

            switch (inputCommands[0]) {
                case "TakeOdd": {

                    text = concatenateOddSymbols(text);
                    System.out.println(text);
                    break;
                }
                case "Cut": {
                    int index = Integer.parseInt(inputCommands[1]);
                    int length = Integer.parseInt(inputCommands[2]);

                    text = cut(text, index, length);
                    System.out.println(text);

                    break;
                }
                case "Substitute": {
                    String substr = inputCommands[1];
                    String substitute = inputCommands[2];

                    if (text.contains(substr)) {
                        text = replaceAll(text, substr, substitute);
                        System.out.println(text);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Your password is: %s%n", text);
    }

    private static String replaceAll(String text, String substr, String substitute) {
        return text.replaceAll(substr, substitute);
    }

    private static String cut(String text, int index, int length) {
        String substr = text.substring(index, index + length);
        text = text.replaceFirst(substr, "");

        return text;
    }

    private static String concatenateOddSymbols(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 != 0) sb.append(text.charAt(i));
        }

        return sb.toString();
    }
}
