package SoftUni.fundamentals.basicSyntax.exercises;

import java.util.Scanner;

public class P09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float budget = Float.parseFloat(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        int freeBeltsCount = numberOfStudents / 6;
        double totalCost = (Math.ceil(numberOfStudents * 1.1) * lightsaberPrice) + (robePrice * numberOfStudents) + ((numberOfStudents - freeBeltsCount) * beltPrice);

        if (totalCost <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalCost - budget);
        }
    }
}
