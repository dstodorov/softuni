package SoftUni.basics.firstSteps.moreExercises;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerel = Double.parseDouble(scanner.nextLine()); // Скумрия, цена на КГ
        double sprat = Double.parseDouble(scanner.nextLine()); // Цаца, цена нг КГ
        double bonitoKg = Double.parseDouble(scanner.nextLine()); // Паламуд КГ
        double scadKg = Double.parseDouble(scanner.nextLine()); // Сафрид КГ
        int musselsKg = Integer.parseInt(scanner.nextLine()); // Миди КГ
        double bonito = (1.6 * mackerel) * bonitoKg; // Паламуд общо цена
        double scad = (1.8 * sprat) * scadKg; // Сафрид общо цена
        double mussels = musselsKg * 7.5; // Миди общо цена

        double totalPrice = bonito + scad + mussels;
        System.out.printf("%.2f", totalPrice);
    }
}
