package SoftUni.basics.firstSteps.exercises;

import java.util.Scanner;

public class P05SuppliesToSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float PENCILS_PRICE = 5.8f;
        float MARKERS_PRICE = 7.2f;
        float CLEANER_PRICE = 1.2f;

        int pencilPackages = scanner.nextInt();
        int markerPackages = scanner.nextInt();
        int cleanerLiters = scanner.nextInt();
        int discount = scanner.nextInt();

        if ((pencilPackages >= 0 && pencilPackages <= 100)
                && (markerPackages >= 0 && markerPackages <= 100)
                && (cleanerLiters >= 0 && cleanerLiters <= 50)
                && (discount >= 0 && discount <= 100)) {
            float costWithoutDiscount = (pencilPackages * PENCILS_PRICE) + (markerPackages * MARKERS_PRICE) + (cleanerLiters * CLEANER_PRICE);
            float totalCost = costWithoutDiscount - (costWithoutDiscount * discount/100);
            System.out.println(totalCost);
        }
    }
}
