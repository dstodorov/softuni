package SoftUni.fundamentalsJanuary.dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kegsCount = Integer.parseInt(scanner.nextLine());
        String bestKegModel = "";
        double bestKegVolume = 0;

        for (int i = 0; i < kegsCount; i++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double kegVolume = Math.PI * Math.pow(radius, 2) * height;

            if (kegVolume > bestKegVolume) {
                bestKegVolume = kegVolume;
                bestKegModel = kegModel;
            }
        }
        System.out.println(bestKegModel);
    }
}
