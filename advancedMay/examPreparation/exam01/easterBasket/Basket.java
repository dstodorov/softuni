package SoftUni.advancedMay.examPreparation.exam01.easterBasket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basket {
    private List<Egg> data;
    private String material;
    private int capacity;

    public Basket(String material, int capacity) {
        this.data = new ArrayList<>();
        this.material = material;
        this.capacity = capacity;
    }

    public void addEgg(Egg egg) {
        if (this.data.size() < capacity){
            this.data.add(egg);
        }
    }

    public boolean removeEgg(String color) {
        Egg egg = this.data.stream().filter(e -> e.getColor().equals(color)).findFirst().orElse(null);
        if (egg != null) {
            this.data.remove(egg);
            return true;
        }
        return false;
    }

    public Egg getStrongestEgg(){
        return this.data.stream().max(Comparator.comparing(Egg::getStrength)).orElse(null);
    }

    public Egg getEgg(String color) {
        return this.data.stream().filter(egg -> egg.getColor().equals(color)).findFirst().orElse(null);
    }

    public int getCount() {
        return this.data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.material).append(" basket contains:").append("\n");
        this.data.forEach(egg -> sb.append(egg).append("\n"));
        return sb.toString().trim();
    }
}
