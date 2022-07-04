package SoftUni.advancedMay.oop.inheritance.exercises.restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {
    final static double COFFEE_MILLILITERS = 50.0;
    final static BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.5);
    private double caffeine;

    public Coffee(String name, double caffeine) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }
}
