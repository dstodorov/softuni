package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite;

import java.util.List;

public interface LieutenantGeneral {
    void addPrivate(PrivateImpl priv);
    List<PrivateImpl> getPrivates();
}
