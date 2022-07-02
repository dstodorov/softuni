package SoftUni.advancedMay.oop.encapsulation.exercises.pizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaDetails = scanner.nextLine().split("\\s");

        String pizzaName = pizzaDetails[1];
        int pizzaNumberOfToppings = Integer.parseInt(pizzaDetails[2]);

        Pizza pizza = new Pizza(pizzaName, pizzaNumberOfToppings);

        String[] doughDetails = scanner.nextLine().split("\\s");

        String flourType = doughDetails[1];
        String bakingTechnique = doughDetails[2];
        double doughWeight = Double.parseDouble(doughDetails[3]);

        Dough dough = new Dough(flourType, bakingTechnique, doughWeight);
        pizza.setDough(dough);

        String toppingInput = scanner.nextLine();

        while (!toppingInput.equals("END")) {
            String[] toppingDetails = toppingInput.split("\\s");

            String toppingName = toppingDetails[1];
            double toppingWeight = Double.parseDouble(toppingDetails[2]);

            Topping topping = new Topping(toppingName, toppingWeight);
            pizza.addTopping(topping);

            toppingInput = scanner.nextLine();
        }

        System.out.printf("%s - %.2f%n",pizza.getName(), pizza.getOverallCalories());
    }
}
