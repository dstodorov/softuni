package SoftUni.basics.nestedLoops.exercises;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int n = 1;
        boolean stop = false;

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(n + " ");

                if (n == number) {
                    stop = true;
                    break;
                }
                n++;
            }
            if (stop) break;
            else System.out.println();
        }
    }
}
