package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite;

public class Mission {
    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        setState(state);
    }

    public void setState(String state) {
        if (!state.equals("inProgress") && !state.equals("finished")) throw new IllegalArgumentException("invalid mission state");
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.codeName, this.state);
    }

    public void completeMission() {
        this.state = "finished";
    }
}
