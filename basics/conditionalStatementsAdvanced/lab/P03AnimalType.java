package SoftUni.basics.conditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P03AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();

        switch (animal) {
            case "dog": {
                System.out.println("mammal");
                break;
            }
            case "snake": {
                System.out.println("reptile");
                break;
            }
            case "tortoise": {
                System.out.println("reptile");
                break;
            }
            case "crocodile": {
                System.out.println("reptile");
                break;
            }
            default: {
                System.out.println("unknown");
                break;
            }
        }
    }
}
