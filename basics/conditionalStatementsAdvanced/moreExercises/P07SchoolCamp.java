package SoftUni.basics.conditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = 0;
        double discount = 0;
        double totalPrice = 0;
        String discipline = "";

        if (season.equals("Winter")) {
            if (groupType.equals("boys")) {
                pricePerNight = 9.6;
                discipline = "Judo";
            }
            if (groupType.equals("girls")) {
                pricePerNight = 9.6;
                discipline = "Gymnastics";
            }
            if (groupType.equals("mixed")) {
                pricePerNight = 10.0;
                discipline = "Ski";
            }
        }
        if (season.equals("Spring")) {
            if (groupType.equals("boys")) {
                pricePerNight = 7.2;
                discipline = "Tennis";
            }
            if (groupType.equals("girls")){
                pricePerNight = 7.2;
                discipline = "Athletics";
            }
            if (groupType.equals("mixed")) {
                pricePerNight = 9.5;
                discipline = "Cycling";
            }
        }
        if (season.equals("Summer")) {
            if (groupType.equals("boys")) {
                pricePerNight = 15;
                discipline = "Football";
            }
            if (groupType.equals("girls")) {
                pricePerNight = 15;
                discipline = "Volleyball";
            }
            if (groupType.equals("mixed")) {
                pricePerNight = 20;
                discipline = "Swimming";
            }
        }

        totalPrice = nights * pricePerNight * students;

        if (students >= 50) {
            discount = 0.5;
        }
        if (students >= 20 && students < 50) {
            discount = 0.15;
        }
        if (students >= 10 && students < 20) {
            discount = 0.05;
        }

        totalPrice -= totalPrice * discount;

        System.out.printf("%s %.2f lv.", discipline, totalPrice);
    }
}
