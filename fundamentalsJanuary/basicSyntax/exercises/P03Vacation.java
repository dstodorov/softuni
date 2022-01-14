package SoftUni.fundamentalsJanuary.basicSyntax.exercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());;
        String groupType = scanner.nextLine();
        String weekDay = scanner.nextLine();

        double pricePerPerson = 0;
        double discount = 0;
        double totalCost = 0;

        if (groupType.equals("Students")) {
            if (numberOfPeople >= 30) {discount = 0.15;}
            if (weekDay.equals("Friday")) {
                pricePerPerson = 8.45;
            } else if (weekDay.equals("Saturday")) {
                pricePerPerson = 9.80;
            } else if (weekDay.equals("Sunday")) {
                pricePerPerson = 10.46;
            }
        } else if (groupType.equals("Business")) {
            if (numberOfPeople >= 100) {numberOfPeople -= 10;}
            if (weekDay.equals("Friday")) {
                pricePerPerson = 10.90;
            } else if (weekDay.equals("Saturday")) {
                pricePerPerson = 15.60;
            } else if (weekDay.equals("Sunday")) {
                pricePerPerson = 16;
            }
        } else if (groupType.equals("Regular")) {
            if (numberOfPeople >= 10 && numberOfPeople <= 20) {discount = 0.05;}
            if (weekDay.equals("Friday")) {
                pricePerPerson = 15;
            } else if (weekDay.equals("Saturday")) {
                pricePerPerson = 20;
            } else if (weekDay.equals("Sunday")) {
                pricePerPerson = 22.50;
            }
        }

        totalCost = numberOfPeople * pricePerPerson - (discount * (numberOfPeople * pricePerPerson));
        System.out.printf("Total price: %.2f", totalCost);

    }
}
