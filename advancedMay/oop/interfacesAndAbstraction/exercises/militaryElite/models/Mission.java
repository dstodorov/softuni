package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.models;

import SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.enums.MissionStates;

public class Mission {
    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        setState(state);
    }

    public void setState(String state) {
        if (state.equals(MissionStates.inProgress.toString())) {
            this.state = MissionStates.inProgress.toString();
        } else if (state.equals(MissionStates.finished.toString())) {
            this.state = MissionStates.finished.toString();
        } else {
            this.state = "invalid";
        }
    }

    public String getCodeName() {
        return codeName;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.codeName, this.state);
    }

    public void completeMission() {
        this.state = "finished";
    }
}
