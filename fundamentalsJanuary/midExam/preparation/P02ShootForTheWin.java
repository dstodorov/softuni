package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int totalTargets = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            int targetIndex = Integer.parseInt(input);

            if (targetIndex >= 0 && targetIndex <= targets.size() - 1 && targets.get(targetIndex) != -1) {
                int targetValue = targets.get(targetIndex);
                shootTarget(targets, targetIndex);
                totalTargets++;
                reduceIncreaseTargets(targets, targetIndex, targetValue);
            }

            input = scanner.nextLine();
        }
        System.out.println();
        System.out.printf("Shot targets: %d -> ", totalTargets);
        for (int targetValue : targets) {
            System.out.print(targetValue + " ");
        }
    }

    private static void reduceIncreaseTargets(List<Integer> targets, int targetIndex, int targetValue) {
        for (int i = 0; i < targets.size(); i++) {
            if (targets.get(i) != -1 && targets.get(i) > targetValue) {
                int newValue = targets.get(i) - targetValue;
                targets.set(i, newValue);
            } else if (targets.get(i) != -1 && targets.get(i) <= targetValue) {
                int newValue = targets.get(i) + targetValue;
                targets.set(i, newValue);
            }
        }
    }

    private static void shootTarget(List<Integer> targets, int targetIndex) {
        targets.set(targetIndex, -1);
    }
}
