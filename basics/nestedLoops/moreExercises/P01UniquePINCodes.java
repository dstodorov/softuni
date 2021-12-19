package SoftUni.basics.nestedLoops.moreExercises;

import java.util.Scanner;

public class P01UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digitOneMax = Integer.parseInt(scanner.nextLine());
        int digitTwoMax = Integer.parseInt(scanner.nextLine());
        int digitThreeMax = Integer.parseInt(scanner.nextLine());

        for (int digitOne = 1; digitOne <= digitOneMax; digitOne++) {
            for (int digitTwo = 1; digitTwo <= digitTwoMax; digitTwo++) {
                boolean isDigitTwoPrime = false;
                if (digitTwo >= 2 && digitTwo <= 7) {
                    if(digitTwo == 2 || digitTwo == 3 || digitTwo == 5 || digitTwo == 7) isDigitTwoPrime = true;
                }
                for (int digitThree = 1; digitThree <= digitThreeMax; digitThree++) {
                    if (digitOne % 2 == 0 && digitThree % 2 == 0 && isDigitTwoPrime) {
                        System.out.printf("%d %d %d%n", digitOne, digitTwo, digitThree);
                    }
                }
            }
        }
    }
}
