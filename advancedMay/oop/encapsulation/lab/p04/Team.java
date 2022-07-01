package SoftUni.oop.encapsulation.lab.p04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(this.reserveTeam);
    }

    public Team(String name) {
        this.name = name;
        firstTeam = new ArrayList<>();
        reserveTeam = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void addPlayer(Person person) {
        if (person.getAge() < 40) {
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }


}
