package SoftUni.advancedMay.oop.inheritance.exercises.animals;

public class Dog extends Animal {
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound() {
        return "Woof!";
    }

    @Override
    public String toString() {
        return super.toString() + produceSound();
    }
}
