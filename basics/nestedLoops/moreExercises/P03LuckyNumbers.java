package SoftUni.basics.nestedLoops.moreExercises;

import java.util.Scanner;

public class P03LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int digitOne = 1; digitOne <= 9; digitOne++) {
            for (int digitTwo = 1; digitTwo <= 9; digitTwo++) {
                for (int digitThree = 1; digitThree <= 9; digitThree++) {
                    for (int digitFour = 1; digitFour <= 9; digitFour++) {
                        boolean isLucky = (digitOne + digitTwo == digitThree + digitFour) && (n % (digitOne + digitTwo) == 0);
                        if (isLucky) {
                            System.out.printf("%d%d%d%d ", digitOne, digitTwo, digitThree, digitFour);
                        }
                    }
                }
            }
        }
    }
}
