package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private String corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        setCorps(corps);
    }

    private void setCorps(String corps) {
        if (!corps.equals("Airforces") && !corps.equals("Marines")) throw new IllegalArgumentException("invalid corps");
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }
}
