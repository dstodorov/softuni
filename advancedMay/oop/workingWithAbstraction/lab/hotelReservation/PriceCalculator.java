package SoftUni.advancedMay.oop.workingWithAbstraction.lab.hotelReservation;

public class PriceCalculator {
    static double calculate(double pricePerDay, int numberOfDays, String vacationSeason, String discountType) {
        Season season = Season.valueOf(vacationSeason);
        Discount discount = Discount.valueOf(discountType);

        double priceWithoutDiscount = (pricePerDay * season.getMultiplier()) * numberOfDays;

        return priceWithoutDiscount - (priceWithoutDiscount * discount.getDiscount());
    }
}
