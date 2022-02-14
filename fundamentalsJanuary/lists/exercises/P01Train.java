package SoftUni.fundamentalsJanuary.lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] splitted = input.split(" ");
            String command = splitted[0];
            if (command.equals("Add")) {
                int passengers = Integer.parseInt(splitted[1]);
                train.add(passengers);
            } else {
                int passengersLeft = Integer.parseInt(splitted[0]);
                printWagonsWithEmptySeats(train, passengersLeft, maxCapacity);
            }


            input = scanner.nextLine();
        }

        for (int wagon : train) {
            System.out.print(wagon + " ");
        }
    }

    private static void printWagonsWithEmptySeats(List<Integer> train, int passengersLeft, int maxCapacity) {
        for (int i = 0; i < train.size(); i++) {
            if (train.get(i) + passengersLeft <= maxCapacity) {
                train.set(i, train.get(i) + passengersLeft);
                break;
            }
        }
    }
}
