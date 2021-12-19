package SoftUni.basics.firstSteps.lab;

import java.util.Scanner;

public class P07ProjectDesign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int projectsNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("The architect " + architectName + " will need " + projectsNumber * 3 + " hours to complete " + projectsNumber + " project/s.");
    }
}
