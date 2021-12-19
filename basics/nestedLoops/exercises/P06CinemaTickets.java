package SoftUni.basics.nestedLoops.exercises;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticketsSold = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;

        while (true) {
            String inputMovie = scanner.nextLine();
            if (!inputMovie.equals("Finish")) {
                int freeSeats = Integer.parseInt(scanner.nextLine());
                int counter = 0;
                for (int i = 1; i <= freeSeats; i++) {
                    String seatInput = scanner.nextLine();
                    if (seatInput.equals("End")) {
                        break;
                    } else {
                        if (seatInput.equals("student")) studentTickets++;
                        if (seatInput.equals("standard")) standardTickets++;
                        if (seatInput.equals("kid")) kidsTickets++;
                        counter++;
                        ticketsSold++;
                    }
                }
                System.out.printf("%s - %.2f%% full.%n", inputMovie, counter * 1.0 / freeSeats * 100);
            } else {
                break;
            }
        }
        System.out.printf("Total tickets: %d%n", ticketsSold);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * studentTickets / ticketsSold * 100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * standardTickets / ticketsSold * 100);
        System.out.printf("%.2f%% kids tickets.%n", 1.0 * kidsTickets / ticketsSold * 100);
    }
}
