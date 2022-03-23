package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int queue = Integer.parseInt(scanner.nextLine());
        List<Integer> lift = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (queue > 0 && !isLiftFull(lift)) {
            fillSeat(lift);
            queue--;
        }

        if (!isLiftFull(lift) && queue == 0) {
            System.out.printf("The lift has empty spots!%n");
            printLift(lift);
        } else if (isLiftFull(lift) && queue > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", queue);
            printLift(lift);
        } else {
            printLift(lift);
        }

    }

    private static void printLift(List<Integer> lift) {
        for (int wagon : lift) {
            System.out.print(wagon + " ");
        }
    }

    private static void fillSeat(List<Integer> lift) {
        for (int i = 0; i < lift.size(); i++) {
            if (lift.get(i) < 4) {
                lift.set(i, lift.get(i) + 1);
                break;
            }
        }
    }

    private static boolean isLiftFull(List<Integer> lift) {
        boolean status = true;

        for (int wagon : lift) {
            if (wagon < 4) {
                status = false;
                break;
            }
        }

        return status;
    }
}
