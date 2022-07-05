package SoftUni.advancedMay.oop.interfacesAndAbstraction.lab.carShopExtend;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer getHorsePower, String countryProduced, Double price) {
        super(model, color, getHorsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }


    @Override
    public String toString() {
        return super.toString() + String.format("%s sells for %f", super.getModel(), this.price);
    }
}
