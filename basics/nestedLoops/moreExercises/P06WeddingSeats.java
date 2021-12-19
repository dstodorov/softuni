package SoftUni.basics.nestedLoops.moreExercises;

import java.util.Scanner;

public class P06WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastSector = scanner.nextLine();
        int rowsPerSector = Integer.parseInt(scanner.nextLine());
        int oddRowSeats = Integer.parseInt(scanner.nextLine());

        int evenRowSeats = oddRowSeats + 2;
        int totalSeats = 0;



        for (char sector = 'A'; sector <= lastSector.charAt(0); sector++) {
            for (int row = 1; row <= rowsPerSector; row++) {
                if (row % 2 == 0) {
                    for (char seat = 'a'; seat <= 'a' + evenRowSeats - 1; seat++) {
                        System.out.printf("%s%d%s%n", sector, row, seat);
                        totalSeats++;
                    }
                } else {
                    for (char seat = 'a'; seat <= 'a' + oddRowSeats - 1; seat++) {
                        System.out.printf("%s%d%s%n", sector, row, seat);
                        totalSeats++;
                    }
                }
            }
            rowsPerSector++;
        }
        System.out.println(totalSeats);
    }
}
