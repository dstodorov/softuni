package SoftUni.basics.whileLoop.moreExercises;

import java.util.Scanner;

public class P03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputChar = "";
        boolean cFound = false;
        boolean oFound = false;
        boolean nFound = false;

        StringBuilder word = new StringBuilder();
        StringBuilder sentence = new StringBuilder();

        while (true) {
            inputChar = scanner.nextLine();

            if (inputChar.equals("End")) {
                break;
            } else {
                if (Character.getNumericValue(inputChar.charAt(0)) >= 10 && Character.getNumericValue(inputChar.charAt(0)) <= 35) {
                    if (inputChar.charAt(0) == 'c' && !cFound) {
                        cFound = true;
                    } else if (inputChar.charAt(0) == 'o' && !oFound){
                        oFound = true;
                    } else if (inputChar.charAt(0) == 'n' && !nFound) {
                        nFound = true;
                    } else {
                        word.append(inputChar);
                    }

                    if (cFound && oFound && nFound) {
                        sentence.append(word).append(" ");
                        word.setLength(0);
                        cFound = false;
                        oFound = false;
                        nFound = false;
                    }
                }
            }
        }
        System.out.println(sentence);
    }
}
