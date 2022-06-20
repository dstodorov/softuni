package SoftUni.advancedMay.examPreparation.exam03.aquarium;

import java.util.LinkedHashSet;
import java.util.Set;

public class Aquarium {
    private String name;
    private int capacity;
    private int size;
    private Set<Fish> fishInPool;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public int getFishInPool() {
        return fishInPool.size();
    }

    public void add(Fish fish) {
        if (fishInPool.size() < this.capacity) fishInPool.add(fish);
    }

    public boolean remove(String name) {
        Fish fish = fishInPool.stream().filter(f -> f.getName().equals(name)).findFirst().orElse(null);

        return fishInPool.remove(fish);
    }

    public Fish findFish(String name) {
        return fishInPool.stream().filter(f -> f.getName().equals(name)).findFirst().orElse(null);
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aquarium: ").append(this.name).append(" ^ Size: ").append(this.size).append("\n");
        this.fishInPool.forEach(f -> sb.append(f).append("\n"));
        return sb.toString().trim();
    }
}
