package SoftUni.basics.conditionalStatements.moreExercises;

import java.util.Scanner;

public class P09FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double litersOfFuel = Double.parseDouble(scanner.nextLine());
        String discountCard = scanner.nextLine();
        boolean discount = discountCard.equals("Yes");
        double totalCost = 0;



        switch (fuelType) {
            case "Gas": {
                double pricePerLiter = 0.93;
                if (discount) pricePerLiter -= 0.08;
                totalCost = litersOfFuel * pricePerLiter;
                if (litersOfFuel >= 20 && litersOfFuel <= 25) {
                    totalCost -= totalCost * 0.08;
                } else if (litersOfFuel > 25) {
                    totalCost -= totalCost * 0.1;
                }
                System.out.printf("%.2f lv.", totalCost);
                break;
            }
            case "Gasoline": {
                double pricePerLiter = 2.22;
                if (discount) pricePerLiter -= 0.18;
                totalCost = litersOfFuel * pricePerLiter;
                if (litersOfFuel >= 20 && litersOfFuel <= 25) {
                    totalCost -= totalCost * 0.08;
                } else if (litersOfFuel > 25) {
                    totalCost -= totalCost * 0.1;
                }
                System.out.printf("%.2f lv.", totalCost);
                break;
            }
            case "Diesel": {
                double pricePerLiter = 2.33;
                if (discount) pricePerLiter -= 0.12;
                totalCost = litersOfFuel * pricePerLiter;
                if (litersOfFuel >= 20 && litersOfFuel <= 25) {
                    totalCost -= totalCost * 0.08;
                } else if (litersOfFuel > 25) {
                    totalCost -= totalCost * 0.1;
                }
                System.out.printf("%.2f lv.", totalCost);
                break;
            }
            default: {
                break;
            }
        }
    }
}
