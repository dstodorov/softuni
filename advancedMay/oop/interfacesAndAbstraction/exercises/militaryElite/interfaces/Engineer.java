package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.interfaces;

import SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.models.Repair;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);
    Collection<Repair> getRepairs();
}
