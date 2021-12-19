package SoftUni.basics.conditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productName = scanner.nextLine();
        String town = scanner.nextLine();
        float quantity = Float.parseFloat(scanner.nextLine());

        switch (productName) {
            case "coffee" :
                if (town.equals("Sofia")) {
                    System.out.println(quantity * 0.5);
                } else if (town.equals("Plovdiv")) {
                    System.out.println(quantity * 0.4);
                } else if (town.equals("Varna")) {
                    System.out.println(quantity * 0.45);
                }
                break;
            case "water":
                if (town.equals("Sofia")) {
                    System.out.println(quantity * 0.8);
                } else if (town.equals("Plovdiv")) {
                    System.out.println(quantity * 0.7);
                } else if (town.equals("Varna")) {
                    System.out.println(quantity * 0.7);
                }
                break;
            case "beer" :
                if (town.equals("Sofia")) {
                    System.out.println(quantity * 1.2);
                } else if (town.equals("Plovdiv")) {
                    System.out.println(quantity * 1.15);
                } else if (town.equals("Varna")){
                    System.out.println(quantity * 1.1);
                }
                break;
            case "sweets" :
                if (town.equals("Sofia")) {
                    System.out.println(quantity * 1.45);
                } else if (town.equals("Plovdiv")) {
                    System.out.println(quantity * 1.3);
                } else if (town.equals("Varna")){
                    System.out.println(quantity * 1.35);
                }
                break;
            case "peanuts" :
                if (town.equals("Sofia")) {
                    System.out.println(quantity * 1.6);
                } else if (town.equals("Plovdiv")) {
                    System.out.println(quantity * 1.5);
                } else if (town.equals("Varna")){
                    System.out.println(quantity * 1.55);
                }
                break;
            default :
                System.out.println("Error");
        }
    }
}
