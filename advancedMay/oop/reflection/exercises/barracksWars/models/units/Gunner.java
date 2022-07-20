package SoftUni.advancedMay.oop.reflection.exercises.barracksWars.models.units;

import barracksWars.models.units.AbstractUnit;

public class Gunner extends AbstractUnit {
    private static final int PIKEMAN_HEALTH = 20;
    private static final int PIKEMAN_DAMAGE = 20;

    public Gunner() {
        super(PIKEMAN_HEALTH, PIKEMAN_DAMAGE);
    }
}
