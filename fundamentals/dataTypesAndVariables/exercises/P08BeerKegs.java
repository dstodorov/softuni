package SoftUni.fundamentals.dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String biggerKegModel = "";
        double biggerKegVolume = 0;

        for (int i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double kegVolume = Math.PI * radius * radius * height;
            if (i == 1) {
                biggerKegModel = model;
                biggerKegVolume = kegVolume;
            } else {
                if (kegVolume > biggerKegVolume) {
                    biggerKegModel = model;
                    biggerKegVolume = kegVolume;
                }
            }
        }
        System.out.println(biggerKegModel);
    }
}
