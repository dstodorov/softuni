package SoftUni.fundamentalsJanuary.textProcessing.exercises;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        int punchPower = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '>') {
                result.append(">");
                punchPower += Character.getNumericValue(text.charAt(i + 1));
            } else {
                if (punchPower > 0) {
                    punchPower--;
                } else {
                    result.append(text.charAt(i));
                }
            }
        }
        System.out.println(result);

    }
}
