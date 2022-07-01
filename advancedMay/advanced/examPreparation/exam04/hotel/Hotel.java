package SoftUni.advancedMay.advanced.examPreparation.exam04.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String name;
    private int capacity;
    private List<Person> roster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void add(Person person) {
        if (roster.size() < capacity) roster.add(person);
    }

    public boolean remove(String name) {
        Person person = roster.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
        return roster.remove(person);
    }

    public Person getPerson(String name, String hometown) {
        return roster.stream().filter(p -> p.getName().equals(name) && p.getHometown().equals(hometown)).findFirst().orElse(null);
    }

    public int getCount() {
        return roster.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The people in the SoftUni.advancedMay.advanced.examPreparation.exam04.hotel ").append(this.name).append(" are:").append("\n");
        this.roster.forEach(p -> sb.append(p).append("\n"));
        return sb.toString().trim();
    }
}
