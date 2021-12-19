package SoftUni.basics.nestedLoops.moreExercises;

import java.util.Scanner;

public class P05ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int usedTables = 0;
        boolean allTablesOccupied = false;

        for (int m = 1; m <= men; m++) {
            for (int w = 1; w <= women; w++) {
                usedTables++;
                System.out.printf("(%d <-> %d) ", m, w);
                if (usedTables == tables) {
                    allTablesOccupied = true;
                    break;
                }
            }
            if (allTablesOccupied) break;
        }
    }
}
