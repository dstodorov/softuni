package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.models;
import SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.enums.Corps;
import SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.interfaces.SpecialisedSoldier;
public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private String corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        setCorps(corps);
    }

    private void setCorps(String corps) {
        if (corps.equals(Corps.Airforces.toString())) {
            this.corps = Corps.Airforces.toString();
        } else if (corps.equals(Corps.Marines.toString())) {
            this.corps = Corps.Marines.toString();
        } else {
            this.corps = "invalid";
        }
    }

    @Override
    public String getCorps() {
        return this.corps;
    }
}
