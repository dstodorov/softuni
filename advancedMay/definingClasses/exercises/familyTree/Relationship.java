package SoftUni.advancedMay.definingClasses.exercises.familyTree;

public class Relationship {
    private String firstPersonDetail;
    private String secondPersonDetail;

    public Relationship(String firstPersonDetail, String secondPersonDetail) {
        this.firstPersonDetail = firstPersonDetail;
        this.secondPersonDetail = secondPersonDetail;
    }

    public String getFirstPersonDetail() {
        return firstPersonDetail;
    }

    public String getSecondPersonDetail() {
        return secondPersonDetail;
    }
}
