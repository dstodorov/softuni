package SoftUni.basics.conditionalStatements.exercises;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double metersPerSecond = Double.parseDouble(scanner.nextLine());

        double delay = Math.floor((distance / 15)) * 12.5;
        double time = (distance * metersPerSecond) + delay;

        if (time < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.02f seconds.", time);
        } else {
            double remainingSeconds = time - worldRecord;
            System.out.printf("No, he failed! He was %.02f seconds slower.", remainingSeconds);
        }
    }
}
