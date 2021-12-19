package SoftUni.basics.exam.examPreparetion;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int startFourth = startNumber % 10;
        startNumber /= 10;
        int startThird = startNumber % 10;
        startNumber /= 10;
        int startSecond = startNumber % 10;
        startNumber /= 10;
        int startFirst = startNumber % 10;

        int endFourth = endNumber % 10;
        endNumber /= 10;
        int endThird = endNumber % 10;
        endNumber /= 10;
        int endSecond = endNumber % 10;
        endNumber /= 10;
        int endFirst = endNumber % 10;

        for (int i = startFirst; i <= endFirst; i++) {
            for (int j = startSecond; j <= endSecond; j++) {
                for (int k = startThird; k <= endThird; k++) {
                    for (int l = startFourth; l <= endFourth; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
