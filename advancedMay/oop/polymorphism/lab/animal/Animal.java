package SoftUni.advancedMay.oop.polymorphism.lab.animal;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favouriteFood = favoriteFood;
    }

    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s", this.name, this.favouriteFood);
    };

    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favouriteFood;
    }
}
