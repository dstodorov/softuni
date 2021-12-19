package SoftUni.basics.nestedLoops.moreExercises;

import java.util.Scanner;

public class P12TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int controlNumber = Integer.parseInt(scanner.nextLine());
        int a = 0, b = 0, c = 0, d = 0;

        int counter = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (i < j && k > l) {
                            if ((i * j) + (k * l) == controlNumber) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                                counter++;
                                if (counter == 4) {
                                    a = i;
                                    b = j;
                                    c = k;
                                    d = l;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        if (counter > 3) System.out.printf("Password: %d%d%d%d", a, b, c, d);
        else System.out.println("No!");
    }
}
