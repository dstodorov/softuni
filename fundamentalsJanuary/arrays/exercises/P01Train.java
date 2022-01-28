package SoftUni.fundamentalsJanuary.arrays.exercises;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonCount = Integer.parseInt(scanner.nextLine());
        int[] train = new int[wagonCount];
        int totalPpl = 0;
        for (int i = 0; i < wagonCount; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int pplPerWagon : train) {
            totalPpl += pplPerWagon;
            System.out.print(pplPerWagon + " ");
        }
        System.out.printf("%n%d", totalPpl);
    }
}
