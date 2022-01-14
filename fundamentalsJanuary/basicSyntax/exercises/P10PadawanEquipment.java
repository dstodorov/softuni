package SoftUni.fundamentalsJanuary.basicSyntax.exercises;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());;
        double pricePerLightsaber = Double.parseDouble(scanner.nextLine());
        double pricePerRobe = Double.parseDouble(scanner.nextLine());
        double pricePerBelt = Double.parseDouble(scanner.nextLine());

        double costForLightsabers = Math.ceil(numberOfStudents * 1.1) * pricePerLightsaber;
        double costForRobes = numberOfStudents * pricePerRobe;
        int freeBelts = numberOfStudents / 6;

        double costForBelts = (numberOfStudents - freeBelts) * pricePerBelt;
        double totalCost = costForLightsabers + costForRobes + costForBelts;
        if (budget >= totalCost) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalCost - budget);
        }
    }
}
