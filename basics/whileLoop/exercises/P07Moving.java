package SoftUni.basics.whileLoop.exercises;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int totalCubicMeters = (width * length * height);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Done")) {
                System.out.printf("%d Cubic meters left.", totalCubicMeters);
                break;
            } else {
                totalCubicMeters -= Integer.parseInt(input);
                if (totalCubicMeters < 0) {
                    System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalCubicMeters));
                    break;
                }
            }
        }
    }
}
