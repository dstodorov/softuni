package SoftUni.advancedMay.oop.workingWithAbstraction.exercises.greedyTimes;

import java.util.Map;
import java.util.TreeMap;

public class Bag {
    private final long capacity;
    private final Map<String, Long> gold;
    private final Map<String, Long> gems;
    private final Map<String, Long> cash;

    public Bag(long capacity) {
        this.gold = new TreeMap<>();
        this.gems = new TreeMap<>();
        this.cash = new TreeMap<>();
        this.capacity = capacity;
    }

    public long getGoldAmount() {
        return this.gold.values().stream().mapToLong(Long::longValue).sum();
    }

    public long getGemsAmount() {
        return this.gems.values().stream().mapToLong(Long::longValue).sum();
    }

    public long getCashAmount() {
        return this.cash.values().stream().mapToLong(Long::longValue).sum();
    }

    public boolean hasCapacity(int amount) {
        return getGoldAmount() + getGemsAmount() + getCashAmount() + amount <= this.capacity;
    }

    public boolean validateAmountRules(String type, int amount) {
        switch (type) {
            case "Gem" :
                if (getGoldAmount() >= getGemsAmount() + amount) return true;
                break;
            case "Cash" :
                if (getGemsAmount() >= getCashAmount() + amount) return true;
                break;
            case "Gold" :
                return true;
        }
        return false;
    }

    public void add(String type, String itemName, long itemAmount) {
        switch (type) {
            case "Gold":
                if (!gold.containsKey(itemName)) {
                    gold.put(itemName, itemAmount);
                } else {
                    gold.put(itemName, gold.get(itemName) + itemAmount);
                }
                break;
            case "Gem":
                if (!gems.containsKey(itemName)) {
                    gems.put(itemName, itemAmount);
                } else {
                    gems.put(itemName, gems.get(itemName) + itemAmount);
                }
                break;
            case "Cash":
                if (!cash.containsKey(itemName)) {
                    cash.put(itemName, itemAmount);
                } else {
                    cash.put(itemName, cash.get(itemName) + itemAmount);
                }
                break;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getGoldAmount() >= 0) {
            sb.append("<Gold> $").append(getGoldAmount()).append("\n");
            gold.entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(e -> sb.append("##").append(e.getKey()).append(" - ").append(e.getValue()).append("\n"));
        }
        if (getGoldAmount() == 0 ||getGemsAmount() > 0) {
            sb.append("<Gem> $").append(getGemsAmount()).append("\n");
            gems.entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(e -> sb.append("##").append(e.getKey()).append(" - ").append(e.getValue()).append("\n"));
        }
        if (getGoldAmount() == 0 || getCashAmount() > 0) {
            sb.append("<Cash> $").append(getCashAmount()).append("\n");
            cash.entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(e -> sb.append("##").append(e.getKey()).append(" - ").append(e.getValue()).append("\n"));
        }
        return sb.toString().trim();
    }
}
