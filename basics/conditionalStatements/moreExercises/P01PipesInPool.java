package SoftUni.basics.conditionalStatements.moreExercises;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double waterFromP1 = p1 * h;
        double waterFromP2 = p2 * h;
        double totalLitersOfWater = waterFromP1 + waterFromP2;

        if (totalLitersOfWater <= v) {
            double p1percent = (waterFromP1 / totalLitersOfWater) * 100;
            double p2percent = (waterFromP2 / totalLitersOfWater) * 100;
            double totalPercent = (totalLitersOfWater / v) * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalPercent, p1percent, p2percent);
        } else {
            double waterOverflow = (waterFromP1 + waterFromP2) - v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, waterOverflow);
        }
    }
}
