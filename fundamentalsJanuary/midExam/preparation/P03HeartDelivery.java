package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> neighborhood = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());

        String inputCommand = scanner.nextLine();
        int cupidPositionIndex = 0;
        while (!inputCommand.equals("Love!")) {
            String[] rawCommands = inputCommand.split(" ");
            String command = rawCommands[0];
            int length = Integer.parseInt(rawCommands[1]);

            boolean isOutsideNeighborhood = cupidPositionIndex + length > neighborhood.size() - 1;
            if (!isOutsideNeighborhood) {
                if (command.equals("Jump")) {
                    int targetPosition = cupidPositionIndex + length;
                    cupidPositionIndex = jump(neighborhood, targetPosition);
                }
            } else {
                int targetPosition = 0;
                cupidPositionIndex = jump(neighborhood, targetPosition);
            }
            inputCommand = scanner.nextLine();
        }

        boolean isMissionSuccessful = checkCupidMissionStatus(neighborhood);
        System.out.printf("Cupid's last position was %d.%n", cupidPositionIndex);
        if (isMissionSuccessful) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", getFailedHousesCount(neighborhood));
        }
    }

    private static int getFailedHousesCount(List<Integer> neighborhood) {
        int failedHouses = 0;
        for (int house : neighborhood) {
            if (house > 0) failedHouses++;
        }
        return failedHouses;
    }

    private static boolean checkCupidMissionStatus(List<Integer> neighborhood) {
        boolean status = true;
        for (int house : neighborhood) {
            if (house > 0) {
                status = false;
                break;
            }
        }
        return status;
    }

    private static int jump(List<Integer> neighborhood, int targetPositionIndex) {
        if (neighborhood.get(targetPositionIndex) == 0) {
            System.out.printf("Place %d already had Valentine's day.%n", targetPositionIndex);
        } else {
            neighborhood.set(targetPositionIndex, neighborhood.get(targetPositionIndex) - 2);
            if (neighborhood.get(targetPositionIndex) == 0) {
                System.out.printf("Place %d has Valentine's day.%n", targetPositionIndex);
            }
        }

        return targetPositionIndex;
    }
}

