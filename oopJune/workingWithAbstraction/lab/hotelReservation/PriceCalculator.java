package SoftUni.oopJune.workingWithAbstraction.lab.hotelReservation;

public class PriceCalculator {
    static double calculate(double pricePerDay, int numberOfDays, String vacationSeason, String discountType) {
        Season season;
        Discount discount;

        switch (vacationSeason) {
            case "Summer":
                season = Season.SUMMER;
                break;
            case "Autumn":
                season = Season.AUTUMN;
                break;
            case "Spring":
                season = Season.SPRING;
                break;
            case "Winter":
                season = Season.WINTER;
                break;
            default:
                season = Season.SUMMER;
                break;
        }

        switch (discountType) {
            case "VIP":
                discount = Discount.VIP;
                break;
            case "SecondVisit":
                discount = Discount.SECOND_VISIT;
                break;
            case "None":
                discount = Discount.NONE;
                break;
            default:
                discount = Discount.NONE;
                break;
        }

        double priceWithoutDiscount = (pricePerDay * season.getMultiplier()) * numberOfDays;

        return priceWithoutDiscount - (priceWithoutDiscount * discount.getDiscount());
    }
}
