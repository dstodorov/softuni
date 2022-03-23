package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P18ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warship = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());

        String rawInput = scanner.nextLine();
        boolean destroyedShip = false;

        readCommandLoop:
        while (!rawInput.equals("Retire")) {
            String[] inputCommands = rawInput.split(" ");
            String command = inputCommands[0];

            switch (command) {
                case "Fire" -> {
                    int index = Integer.parseInt(inputCommands[1]);
                    int damage = Integer.parseInt(inputCommands[2]);
                    if (isIndexExists(warship, index)) {
                        attack(warship, index, damage);
                        if (hasSinkedSections(warship)) {
                            System.out.printf("You won! The enemy ship has sunken.%n");
                            destroyedShip = true;
                            break readCommandLoop;
                        }
                    }
                }
                case "Defend" -> {
                    int startIndex = Integer.parseInt(inputCommands[1]);
                    int endIndex = Integer.parseInt(inputCommands[2]);
                    int damage = Integer.parseInt(inputCommands[3]);

                    if (isIndexExists(pirateShip, startIndex) && isIndexExists(pirateShip, endIndex)) {
                        attack(pirateShip, startIndex, endIndex, damage);
                        if (hasSinkedSections(pirateShip)) {
                            System.out.printf("You lost! The pirate ship has sunken.%n");
                            destroyedShip = true;
                            break readCommandLoop;
                        }
                    }
                }
                case "Repair" -> {
                    int index = Integer.parseInt(inputCommands[1]);
                    int health = Integer.parseInt(inputCommands[2]);
                    if (isIndexExists(pirateShip, index)) {
                        repairSection(pirateShip, index, health, maxHealth);
                    }
                }
                case "Status" -> {
                    double minimumThreshold = maxHealth * 0.2;
                    getShipStatus(pirateShip, minimumThreshold);
                }
            }

            rawInput = scanner.nextLine();
        }

        if (!destroyedShip) {
            System.out.printf("Pirate ship status: %d%n", getShipSum(pirateShip));
            System.out.printf("Warship status: %d%n", getShipSum(warship));
        }
    }

    private static int getShipSum(List<Integer> ship) {
        int sum = 0;
        for (int section : ship) {
            sum += section;
        }
        return sum;
    }

    private static void getShipStatus(List<Integer> ship, double minimumThreshold) {
        int sectionForRepair = 0;
        for (int section : ship) {
            if (section < minimumThreshold) sectionForRepair++;
        }
        System.out.printf("%d sections need repair.%n", sectionForRepair);
    }

    private static void repairSection(List<Integer> ship, int index, int health, int maxHealth) {
        int oldValue = ship.get(index);
        int newValue = oldValue + health;
        if (newValue > maxHealth) ship.set(index, maxHealth);
        else ship.set(index, newValue);
    }

    private static boolean hasSinkedSections(List<Integer> ship) {
        boolean hasSinkedSection = false;
        for (int section : ship) {
            if (section == 0) {
                hasSinkedSection = true;
                break;
            }
        }
        return hasSinkedSection;
    }

    private static void attack(List<Integer> ship, int startIndex, int endIndex, int damage) {
        for (int i = startIndex; i <= endIndex; i++) {
            attack(ship, i, damage);
        }
    }

    private static void attack(List<Integer> ship, int index, int damage) {
        int oldValue = ship.get(index);
        int newValue = oldValue - damage;
        if (newValue > 0) ship.set(index, newValue);
        else ship.set(index, 0);
    }

    private static boolean isIndexExists(List<Integer> shipStatus, int index) {
        return index >= 0 && index <= shipStatus.size() - 1;
    }
}
