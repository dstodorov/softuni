package SoftUni.basics.forLoop.moreExercises;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double totalElectricity = 0;
        double totalWater = 0;
        double totalInternet = 0;
        double totalOther = 0;

        for (int i = 0; i < months; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());

            totalElectricity += electricityBill;
            totalWater += 20;
            totalInternet += 15;
            totalOther += (electricityBill + 20 + 15) * 1.2;
        }

        System.out.printf("Electricity: %.2f lv %n", totalElectricity);
        System.out.printf("Water: %.2f lv %n", totalWater);
        System.out.printf("Internet: %.2f lv %n", totalInternet);
        System.out.printf("Other: %.2f lv %n", totalOther);
        System.out.printf("Average: %.2f lv %n", (totalElectricity+totalWater+totalInternet+totalOther)/months);
    }
}
