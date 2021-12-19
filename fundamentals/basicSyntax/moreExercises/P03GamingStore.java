package SoftUni.fundamentals.basicSyntax.moreExercises;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String game1 = "OutFall 4";
        final String game2 = "CS: OG";
        final String game3 = "Zplinter Zell";
        final String game4 = "Honored 2";
        final String game5 = "RoverWatch";
        final String game6 = "RoverWatch Origins Edition";

        double game1Price = 39.99;
        double game2Price = 15.99;
        double game3Price = 19.99;
        double game4Price = 59.99;
        double game5Price = 29.99;
        double game6Price = 39.99;

        double budget = Double.parseDouble(scanner.nextLine());
        String gameName = scanner.nextLine();
        double totalSpend = 0;
        while (!gameName.equals("Game Time")){
            switch (gameName) {
                case game1 :
                    if (budget < game1Price) System.out.println("Too Expensive");
                    else {
                        budget -= game1Price;
                        totalSpend += game1Price;
                        System.out.printf("Bought %s%n", gameName);
                    }
                    break;
                case game2:
                    if (budget < game2Price) System.out.println("Too Expensive");
                    else {
                        budget -= game2Price;
                        totalSpend += game2Price;
                        System.out.printf("Bought %s%n", gameName);
                    }
                    break;
                case game3:
                    if (budget < game3Price) System.out.println("Too Expensive");
                    else {
                        budget -= game3Price;
                        totalSpend += game3Price;
                        System.out.printf("Bought %s%n", gameName);
                    }
                    break;
                case game4:
                    if (budget < game4Price) System.out.println("Too Expensive");
                    else {
                        budget -= game4Price;
                        totalSpend += game4Price;
                        System.out.printf("Bought %s%n", gameName);
                    }
                    break;
                case game5:
                    if (budget < game5Price) System.out.println("Too Expensive");
                    else {
                        budget -= game5Price;
                        totalSpend += game5Price;
                        System.out.printf("Bought %s%n", gameName);
                    }
                    break;
                case game6:
                    if (budget < game6Price) System.out.println("Too Expensive");
                    else {
                        budget -= game6Price;
                        totalSpend += game6Price;
                        System.out.printf("Bought %s%n", gameName);
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (budget == 0){
                System.out.println("Out of money!");
                break;
            }
            gameName = scanner.nextLine();
        }
        if (budget > 0.0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, budget);
        }
    }
}
