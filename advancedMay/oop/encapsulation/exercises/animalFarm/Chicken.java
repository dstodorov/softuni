package SoftUni.advancedMay.oop.encapsulation.exercises.animalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.length() == 0) throw new IllegalArgumentException("Name cannot be empty.");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        double eggsPerDay = 0;
        if (age >= 0 && age <= 5) {
            eggsPerDay = 2.0;
        } else if (age >= 6 && age <= 11) {
            eggsPerDay = 1;
        } else if (age >= 12) {
            eggsPerDay = 0.75;
        }

        return eggsPerDay;
    }


    @Override
    public String toString() {
        return "Chicken Chichi (age " + this.age + ")";
    }
}
