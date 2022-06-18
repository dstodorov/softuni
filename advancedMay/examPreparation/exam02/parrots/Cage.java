package SoftUni.advancedMay.examPreparation.exam02.parrots;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private int capacity;
    private List<Parrot> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Parrot parrot) {
        if (this.data.size() < this.capacity) this.data.add(parrot);
    }

    public boolean remove(String name) {
        Parrot parrot = this.data.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
        if (data.contains(parrot)) {
            this.data.remove(parrot);
            return true;
        }
        return false;
    }

    public Parrot sellParrot(String name) {
        return this.data.stream().filter(p -> p.getName().equals(name) && p.isAvailable()).findFirst().orElse(null);
    }

    public List<Parrot> sellParrotBySpecies(String species) {
        List<Parrot> parrotsList = new ArrayList<>();

        this.data.stream().filter(p -> p.getSpecies().equals(species)).forEach(parrotsList::add);
        this.data.stream().filter(p -> p.getSpecies().equals(species)).forEach(p -> p.setAvailable(false));

        return parrotsList;
    }

    public int count() {
        return this.data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parrots available at ").append(this.name).append(":\n");
        this.data.stream().filter(Parrot::isAvailable).forEach(p -> sb.append(p).append("\n"));

        return sb.toString().trim();
    }
}
