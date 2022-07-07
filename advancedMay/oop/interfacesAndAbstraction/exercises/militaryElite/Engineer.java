package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);
    Collection<Repair> getRepairs();
}
