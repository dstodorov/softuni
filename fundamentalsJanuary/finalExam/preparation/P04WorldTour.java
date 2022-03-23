package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.Scanner;

public class P04WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder tour = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String[] inputCommands = input.split(":");

            if (inputCommands[0].equals("Add Stop")) {
                int index = Integer.parseInt(inputCommands[1]);
                String destination = inputCommands[2];
                if (isIndexValid(tour, index)) {
                    addDestination(tour, index, destination);
                }
            } else if (inputCommands[0].equals("Remove Stop")) {
                int startIndex = Integer.parseInt(inputCommands[1]);
                int endIndex = Integer.parseInt(inputCommands[2]);

                if (isIndexValid(tour, startIndex) && isIndexValid(tour, endIndex)) {
                    remove(tour, startIndex, endIndex);
                }
            } else if (inputCommands[0].equals("Switch")) {
                String oldDestination = inputCommands[1];
                String newDestination = inputCommands[2];
                if (tour.indexOf(oldDestination) != -1) {
                    switchDestinations(tour, oldDestination, newDestination);
                }
            }

            System.out.println(tour);
            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n", tour);
    }

    private static void switchDestinations(StringBuilder tour, String oldDestination, String newDestination) {
        int oldDestinationStartIndex = tour.indexOf(oldDestination);

        while (oldDestinationStartIndex != -1) {
            tour.replace(oldDestinationStartIndex, oldDestinationStartIndex + oldDestination.length(), newDestination);
            oldDestinationStartIndex = tour.indexOf(oldDestination, oldDestinationStartIndex + newDestination.length());
        }
    }

    private static void remove(StringBuilder tour, int startIndex, int endIndex) {
        tour.delete(startIndex, endIndex + 1);
    }

    private static boolean isIndexValid(StringBuilder tour, int index) {
        return index >= 0 && index < tour.length();
    }

    private static void addDestination(StringBuilder tour, int index, String destination) {
        tour.insert(index, destination);
    }
}
