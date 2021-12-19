package SoftUni.basics.nestedLoops.moreExercises;

import java.util.Scanner;

public class P07SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());
        boolean maxReached = false;

        int totalCombinations = 0;
        for (char A = 35; A <= 55; A++) {
            for (char B = 64; B <= 96; B++) {
                for (int x = 1; x <= a; x++) {
                    for (int y = 1; y <= b; y++) {
                        System.out.printf("%s%s%d%d%s%s|", A, B, x, y, B, A);
                        totalCombinations++;
                        if (A > 55){
                            A = 35;
                        } else {
                            A++;
                        }
                        if (B > 96){
                            B = 64;
                        } else {
                            B++;
                        }

                        if (totalCombinations >= maxPasswords) break;
                        if (x == a && y == b) {
                            maxReached = true;
                            break;
                        }
                    }
                    if (totalCombinations >= maxPasswords) break;
                    if (maxReached) break;
                }
                if (totalCombinations >= maxPasswords) break;
                if (maxReached) break;
            }
            if (totalCombinations >= maxPasswords) break;
            if (maxReached) break;
        }


    }
}
