package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.Scanner;

public class P11CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int battlesWon = 0;

        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();

            if (command.equals("End of battle")) {
                System.out.printf("Won battles: %d. Energy left: %d", battlesWon, energy);
                break;
            }

            int distance = Integer.parseInt(command);

            if (distance > energy || energy == 0) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", battlesWon, energy);
                break;
            } else {
                energy -= distance;
                battlesWon++;
            }
            if (battlesWon % 3 == 0) energy += battlesWon;
        }
    }
}

