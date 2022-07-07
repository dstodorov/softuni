package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite;

import java.util.Collection;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, String corps, List<Repair> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = repairs;
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return Collections.unmodifiableList(this.repairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(super.getFirstName()).append(" ").append(super.getLastName()).append(" Id: ").append(super.getId()).append(" Salary: ").append(new Formatter().format("%.2f", super.getSalary()));
        sb.append("\nCorps: ").append(this.getCorps()).append("\n");
        sb.append("Repairs:\n");
        this.repairs.forEach(e -> sb.append("  ").append(e).append("\n"));
        return sb.toString().trim();
    }
}
