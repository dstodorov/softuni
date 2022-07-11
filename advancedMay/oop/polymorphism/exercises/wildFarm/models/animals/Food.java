package SoftUni.advancedMay.oop.polymorphism.exercises.wildFarm.models.animals;

public abstract class Food {
    private Integer quantity;

    public Food(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
