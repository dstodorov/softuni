package SoftUni.advancedMay.oop.interfacesAndAbstraction.lab.carShop;

public interface Car {
    Integer TIRES = 4;
    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();
}
