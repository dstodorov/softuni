package SoftUni.basics.firstSteps.exercises;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualTrainingCost = Integer.parseInt(scanner.nextLine());
        float bootsCost = annualTrainingCost - (annualTrainingCost * 0.4f);
        float sportWearCost = bootsCost - (bootsCost * 0.2f);
        float ballCost = sportWearCost / 4;
        float accessoriesCost = ballCost / 5;
        float totalCost = bootsCost + sportWearCost + ballCost + accessoriesCost + annualTrainingCost;

        System.out.println(totalCost);
    }
}
