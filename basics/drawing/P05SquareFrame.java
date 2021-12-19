package SoftUni.basics.drawing;

import java.util.Scanner;

public class P05SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                if ((i == 1 && j == 1) || (i == x && j == 1) || (i == 1 && j == x || i == x && j == x))
                    System.out.print("+ ");
                else if (j == 1 || j == x) System.out.print("| ");
                else System.out.print("- ");
            }
            System.out.println();
        }
    }
}
