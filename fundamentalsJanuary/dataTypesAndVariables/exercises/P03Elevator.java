package SoftUni.fundamentalsJanuary.dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());
        int result = numberOfPeople / elevatorCapacity;
        if (numberOfPeople % elevatorCapacity > 0) result++;
        System.out.println(result);
    }
}
