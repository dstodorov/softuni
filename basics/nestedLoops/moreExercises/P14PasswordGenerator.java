package SoftUni.basics.nestedLoops.moreExercises;

import java.util.Scanner;

public class P14PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int first = 1; first <= n; first++) {
            for (int second = 1; second <= n; second++) {
                for (char third = 'a'; third <= 'a' + l - 1; third++) {
                    for (char fourth = 'a'; fourth <= 'a' + l - 1; fourth++) {
                        for (int fifth = 1; fifth <= n; fifth++) {
                            if (fifth > first && fifth > second) System.out.printf("%d%d%s%s%d ", first, second, third, fourth, fifth);
                        }
                    }
                }
            }
        }
    }
}
