package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.Scanner;

public class P04GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityOfFood = Double.parseDouble(scanner.nextLine());
        double quantityOfHay = Double.parseDouble(scanner.nextLine());
        double quantityOfCover = Double.parseDouble(scanner.nextLine());
        double guineaPigWeight = Double.parseDouble(scanner.nextLine());

        double foodInGrams = quantityOfFood * 1000;
        double hayInGrams = quantityOfHay * 1000;
        double coverInGrams = quantityOfCover * 1000;
        double pigInGrams = guineaPigWeight * 1000;

        boolean flag = false;

        for (int i = 1; i <= 30; i++) {
            foodInGrams -= 300;

            if (i % 2 == 0) {
                hayInGrams -= foodInGrams * 0.05;
            }
            if (i % 3 == 0) {
                coverInGrams -= ((double) 1 / 3) * pigInGrams;
            }

            if (foodInGrams <= 0 || hayInGrams <= 0 || coverInGrams <= 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodInGrams / 1000, hayInGrams / 1000, coverInGrams / 1000);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
