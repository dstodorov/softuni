package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.models;

import SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.interfaces.Commando;

import java.util.Collection;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private List<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, String corps, List<Mission> missions) {
        super(id, firstName, lastName, salary, corps);
        this.missions = missions;
    }


    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return Collections.unmodifiableList(this.missions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(super.getFirstName()).append(" ").append(super.getLastName()).append(" Id: ").append(super.getId()).append(" Salary: ").append(new Formatter().format("%.2f", super.getSalary()));
        sb.append("\nCorps: ").append(this.getCorps()).append("\n");
        sb.append("Missions:\n");
        this.missions.forEach(m -> sb.append("  ").append(m).append("\n"));
        return sb.toString().trim();
    }
}
