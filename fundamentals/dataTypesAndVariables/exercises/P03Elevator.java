package SoftUni.fundamentals.dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());
        int courses = 0;

        if (elevatorCapacity >= numberOfPeople) courses = 1;
        else {
            if (numberOfPeople % elevatorCapacity == 0) courses = numberOfPeople / elevatorCapacity;
            else courses = (numberOfPeople / elevatorCapacity) + 1;
        }
        System.out.println(courses);
    }
}
