package SoftUni.fundamentalsJanuary.Arrays.exercises;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < n; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            if (i % 2 == 0) {

                secondArr[i] = n2;
                firstArr[i] = n1;
            } else {
                secondArr[i] = n1;
                firstArr[i] = n2;
            }
        }
        for (int number : firstArr) System.out.printf("%d ", number);
        System.out.println();
        for (int number : secondArr) System.out.printf("%d ", number);
    }
}
