package SoftUni.advancedMay.oop.encapsulation.exercises.footballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) throw new IllegalArgumentException("A name should not be empty.");
        this.name = name;
    }

    private void setEndurance(int endurance) {
        if (invalidRange(endurance)) throw new IllegalArgumentException("Endurance should be between 0 and 100.");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        if (invalidRange(sprint)) throw new IllegalArgumentException("Sprint should be between 0 and 100.");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        if (invalidRange(dribble)) throw new IllegalArgumentException("Dribble should be between 0 and 100.");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        if (invalidRange(passing)) throw new IllegalArgumentException("Passing should be between 0 and 100.");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        if (invalidRange(shooting)) throw new IllegalArgumentException("Shooting should be between 0 and 100.");
        this.shooting = shooting;
    }

    public double overallSkillLevel() {
        return this.endurance + this.sprint + this.dribble + this.passing + this.shooting;
    }

    private boolean invalidRange(int stat) {
        return stat < 0 || stat > 100;
    }
}
