package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.interfaces;

import SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.models.Mission;

import java.util.Collection;

public interface Commando {
    void addMission(Mission mission);
    Collection<Mission> getMissions();
}
