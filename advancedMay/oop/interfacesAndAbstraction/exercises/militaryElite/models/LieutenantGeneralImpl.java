package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.models;

import SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.interfaces.LieutenantGeneral;

import java.util.Collections;
import java.util.Comparator;
import java.util.Formatter;
import java.util.List;
import java.util.stream.Collectors;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private List<PrivateImpl> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary, List<PrivateImpl> privates) {
        super(id, firstName, lastName, salary);
        this.privates = privates;
    }


    @Override
    public void addPrivate(PrivateImpl priv) {
        this.privates.add(priv);
    }

    @Override
    public List<PrivateImpl> getPrivates() {
        return Collections.unmodifiableList(this.privates);
    }

    @Override
    public String toString() {
        List<PrivateImpl> sortedListOfPrivates = this.privates.stream().sorted(Comparator.comparing(PrivateImpl::getId).reversed()).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(super.getFirstName()).append(" ").append(super.getLastName()).append(" ").append("Id: ").append(super.getId()).append(" Salary: ").append(new Formatter().format("%.2f", super.getSalary())).append("\n");
        sb.append("Privates:\n");
        sortedListOfPrivates.forEach(p -> sb.append("  ").append(p).append("\n"));
        return sb.toString().trim();
    }
}
