package SoftUni.basics.nestedLoops.lab;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int offices = Integer.parseInt(scanner.nextLine());

        for (int floor = floors; floor > 0; floor--) {
            for (int office = 0; office < offices; office++) {
                String officeNumber = "";
                if (floor == floors) {
                    officeNumber += "L" + floor + office;
                } else {
                    if (floor % 2 == 0) {
                        officeNumber += "O" + floor + office;
                    } else {
                        officeNumber += "A" + floor + office;
                    }
                }
                System.out.print(officeNumber + " ");
            }
            System.out.println();
        }
    }
}
