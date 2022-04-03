package SoftUni.fundamentalsJanuary.finalExam.exam;

import java.util.Scanner;

public class P01StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] inputCommands = input.split(" ");

            switch (inputCommands[0]) {
                case "Change": {
                    str = str.replaceAll(inputCommands[1], inputCommands[2]);
                    System.out.println(str);
                    break;
                }
                case "Includes": {
                    System.out.println(str.contains(inputCommands[1]) ? "True" : "False");
                    break;
                }
                case "End": {
                    System.out.println(endWith(str, inputCommands[1]) ? "True" : "False");
                    break;
                }
                case "Uppercase": {
                    str = makeUpperCase(str);
                    System.out.println(str);
                    break;
                }
                case "FindIndex": {
                    System.out.println(str.indexOf(inputCommands[1]));
                    break;
                }
                case "Cut": {
                    System.out.println(str.substring(Integer.parseInt(inputCommands[1]), Integer.parseInt(inputCommands[1]) + Integer.parseInt(inputCommands[2])));
                    break;
                }
            }

            input = scanner.nextLine();
        }
    }

    private static String makeUpperCase(String str) {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            newStr.append(Character.toUpperCase(str.charAt(i)));
        }

        return newStr.toString();
    }

    private static boolean endWith(String str, String substr) {
        String endSubstring = str.substring(str.length() - substr.length());
        return endSubstring.equals(substr);
    }
}
