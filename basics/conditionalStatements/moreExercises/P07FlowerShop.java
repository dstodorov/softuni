package SoftUni.basics.conditionalStatements.moreExercises;

import java.util.Scanner;

public class P07FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flower1 = Integer.parseInt(scanner.nextLine());
        int flower2 = Integer.parseInt(scanner.nextLine());
        int flower3 = Integer.parseInt(scanner.nextLine());
        int flower4 = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = ((flower1 * 3.25) + (flower2 * 4) + (flower3 * 3.5) + (flower4 * 8));
        double totalPriceWithTax = totalPrice - (totalPrice * 0.05);

        if (totalPrice <= presentPrice) {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(presentPrice - totalPriceWithTax));
        } else {
            System.out.printf("She is left with %.0f leva.", Math.floor(totalPriceWithTax - presentPrice));
        }
    }
}
