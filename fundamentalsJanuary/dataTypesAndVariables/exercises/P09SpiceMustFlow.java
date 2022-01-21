package SoftUni.fundamentalsJanuary.dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int daysMined = 0;
        int spiceExtracted = 0;
        while (startingYield >= 100) {
            spiceExtracted += startingYield;
            if (spiceExtracted >= 26) {
                spiceExtracted -= 26;
            } else {
                spiceExtracted = 0;
            }
            startingYield -= 10;
            daysMined++;
        }
        if (spiceExtracted >= 26) {
            spiceExtracted -= 26;
        }else {
            spiceExtracted = 0;
        }
        System.out.println(daysMined);
        System.out.println(spiceExtracted);
    }
}
