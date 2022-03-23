package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P12MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String rawInput = scanner.nextLine();

        while (!rawInput.equals("End")) {
            String[] commands = rawInput.split(" ");
            String command = commands[0];
            int index = Integer.parseInt(commands[1]);

            if (command.equals("Shoot")) {
                int power = Integer.parseInt(commands[2]);
                if(isTargetExist(targets, index)) {
                    shootTarget(targets, index, power);
                }
            } else if (command.equals("Add")) {
                int value = Integer.parseInt(commands[2]);
                if (isTargetExist(targets, index)) {
                    addTarget(targets, index, value);
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if (command.equals("Strike")) {
                int radius = Integer.parseInt(commands[2]);
                if (isTargetExist(targets, index - radius) && isTargetExist(targets, index + 2)) {
                    strikeTarget(targets, index, radius);
                } else {
                    System.out.println("Strike missed!");
                }
            }
            rawInput = scanner.nextLine();
        }

        printList(targets);
    }

    private static void strikeTarget(List<Integer> targets, int index, int radius) {
        for (int i = index + radius; i >= index - radius; i--) {
            targets.remove(i);
        }
    }

    private static void addTarget(List<Integer> targets, int index, int value) {
        targets.add(index, value);
    }

    private static void shootTarget(List<Integer> targets, int index, int power) {
        targets.set(index, targets.get(index) - power);
        if (targets.get(index) <= 0) targets.remove(index);
    }

    private static boolean isTargetExist(List<Integer> targets, int index) {
        return index >= 0 && index <= targets.size() - 1;
    }

    private static void printList(List<Integer> targets) {
        for (int i = 0; i < targets.size(); i++) {
            if (i == targets.size() - 1) {
                System.out.print(targets.get(i));
            } else {
                System.out.print(targets.get(i) + "|");
            }

        }
    }
}
