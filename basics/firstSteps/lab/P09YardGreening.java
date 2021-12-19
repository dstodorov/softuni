package SoftUni.basics.firstSteps.lab;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double SQ_METER_PRICE = 7.61;
        double squareMeters = Double.parseDouble(scanner.nextLine());
        double price = squareMeters * 7.61;
        double discount = price * 0.18;
        double totalPrice = price - discount;

        System.out.printf("The final price is: %f lv.\n", totalPrice);
        System.out.printf("The discount is: %f lv.", discount);

        //System.out.println("The final price is: " + totalPrice + " lv.");
        //System.out.println("The discount is: " + discount + " lv.");
    }
}
