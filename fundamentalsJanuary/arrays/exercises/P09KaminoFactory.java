package SoftUni.fundamentalsJanuary.arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String dna = scanner.nextLine();

        int bestSum = 1;
        int bestStartIndex = 0;
        int bestDnaSum = 0;
        int bestSample = 0;
        int[] bestDna = new int[n];

        int sample = 0;

        while (!dna.equals("Clone them!")) {
            int[] currentDna = Arrays.stream(dna.split("!+")).mapToInt(Integer::parseInt).toArray();
            sample++;

            int length = 1;
            int bestCurrentSum = 1;
            int startIndex = 0;
            int currentTopSum = 0;

            for (int i = 0; i < currentDna.length - 1; i++) {
                if (currentDna[i] == currentDna[i + 1]) {
                    length++;
                } else {
                    length = 1;
                }
                if (length > bestCurrentSum) {
                    bestCurrentSum = length;
                    startIndex = i;
                }
                currentTopSum += currentDna[i];
            }

            currentTopSum += currentDna[n - 1];

            if (bestCurrentSum > bestSum) {
                bestSum = bestCurrentSum;
                bestStartIndex = startIndex;
                bestDnaSum = currentTopSum;
                bestSample = sample;
                bestDna = Arrays.stream(currentDna).toArray();
            } else if (bestCurrentSum == bestSum) {
                if (startIndex < bestStartIndex) {
                    bestStartIndex = startIndex;
                    bestDnaSum = currentTopSum;
                    bestSample = sample;
                    bestDna = Arrays.stream(currentDna).toArray();

                } else if (startIndex == bestStartIndex) {
                    if (currentTopSum > bestDnaSum) {
                        bestDnaSum = currentTopSum;
                        bestSample = sample;
                        bestDna = Arrays.stream(currentDna).toArray();
                    }
                }
            }
            dna = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSample, bestDnaSum);
        for (int digit : bestDna) {
            System.out.print(digit + " ");
        }
    }
}
