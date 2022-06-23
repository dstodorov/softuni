package SoftUni.advancedMay.examPreparation.exam08.dealership;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dealership {

    public String name;
    public int capacity;
    public List<Car> data;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (this.data.size() < this.capacity) this.data.add(car);
    }

    public boolean buy(String manufacturer, String model) {
        Car car = this.data.stream()
                .filter(c -> c.getManufacturer().equals(manufacturer) && c.getModel().equals(model))
                .findFirst()
                .orElse(null);
        return this.data.remove(car);
    }

    public Car getLatestCar() {
        return this.data.stream().max(Comparator.comparing(Car::getYear)).orElse(null);
    }

    public Car getCar(String manufacturer, String model) {
        return this.data.stream()
                .filter(c -> c.getManufacturer().equals(manufacturer) && c.getModel().equals(model))
                .findFirst()
                .orElse(null);
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The cars are in a car dealership ").append(this.name).append(":\n");
        this.data.forEach(c -> sb.append(c).append("\n"));
        return sb.toString().trim();
    }
}
