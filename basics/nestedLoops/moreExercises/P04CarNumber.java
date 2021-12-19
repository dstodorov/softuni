package SoftUni.basics.nestedLoops.moreExercises;

import java.util.Scanner;

public class P04CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());

        for (int digitOne = min; digitOne <= max; digitOne++) {
            for (int digitTwo = min; digitTwo <= max; digitTwo++) {
                for (int digitThree = min; digitThree <= max; digitThree++) {
                    for (int digitFour = min; digitFour <= max; digitFour++) {
                        boolean isValid = ((digitTwo + digitThree) % 2 == 0)
                                && (digitOne > digitFour)
                                && ((digitOne % 2 == 0 && digitFour % 2 != 0) || (digitOne % 2 != 0 && digitFour % 2 == 0));
                        if (isValid) System.out.printf("%d%d%d%d ", digitOne, digitTwo, digitThree, digitFour);
                    }
                }
            }
        }
    }
}