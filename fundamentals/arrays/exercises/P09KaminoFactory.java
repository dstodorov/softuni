package SoftUni.fundamentals.arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sequenceLength = Integer.parseInt(scanner.nextLine());
        String sequence = scanner.nextLine();

        String bestSequence = "";
        int bestMax = 0;
        int bestMaxSumIndex = 0;
        int bestTotalSum = 0;
        int counter = 0;
        int bestSample = 0;

        while (!sequence.equals("Clone them!")) {
            String cleared = clearSequence(sequence).trim();
            int[] currentSequence = Arrays.stream(cleared.split(" ")).mapToInt(Integer::parseInt).toArray();
            counter++;
            int sum = 0;
            int max = 0;
            int maxSumIndex = 0;
            int totalSum = 0;

            for (int i = 0; i < sequenceLength; i++) {
                if (currentSequence[i] == 1) {
                    sum++;
                    totalSum++;
                    if (sum > max) {
                        max = sum;
                        maxSumIndex = i - sum + 1;
                    }
                } else sum = 0;
            }

            if (bestMax < max) {
                bestSequence = cleared;
                bestMax = max;
                bestMaxSumIndex = maxSumIndex;
                bestTotalSum = max;
                bestSample = counter;
            }
            if (bestMax == max) {
                if (maxSumIndex < bestMaxSumIndex) {
                    bestSequence = cleared;
                    bestMaxSumIndex = maxSumIndex;
                    bestTotalSum = totalSum;
                    bestSample = counter;
                }
                if (maxSumIndex == bestMaxSumIndex) {
                    if (totalSum > bestTotalSum) {
                        bestSequence = cleared;
                        bestTotalSum = totalSum;
                        bestSample = counter;
                    }
                }
            }
            sequence = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSample, bestTotalSum);
        System.out.println(bestSequence.replace("!", " "));
    }
    private static String clearSequence (String sequence) {
        String cleared = "";
        for (int i = 0; i <sequence.length(); i++) {
            if (sequence.charAt(i) == '0' || sequence.charAt(i) == '1') {
                cleared += sequence.charAt(i) + " ";
            }
        }
        return cleared;
    }
}
