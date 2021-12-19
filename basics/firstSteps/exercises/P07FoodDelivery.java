package SoftUni.basics.firstSteps.exercises;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        float CHICKEN_MENU = 10.35f;
        float FISH_MENU = 12.40f;
        float VEGGIE_MENU = 8.15f;

        Scanner scanner = new Scanner(System.in);

        int chickenMenus = scanner.nextInt();
        int fishMenus = scanner.nextInt();
        int veggieMenus = scanner.nextInt();

        float totalWithoutDesert = chickenMenus * CHICKEN_MENU + fishMenus * FISH_MENU + veggieMenus * VEGGIE_MENU;
        float desert = totalWithoutDesert * 0.2f;

        System.out.println(totalWithoutDesert + desert + 2.5);
    }
}
