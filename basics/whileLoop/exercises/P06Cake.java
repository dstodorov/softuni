package SoftUni.basics.whileLoop.exercises;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());

        int totalPieces = cakeLength * cakeWidth;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("STOP")) {
                System.out.printf("%d pieces are left.", totalPieces);
                break;
            } else {
                totalPieces -= Integer.parseInt(input);
                if(totalPieces < 0) {
                    System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
                    break;
                }
            }
        }
    }
}
