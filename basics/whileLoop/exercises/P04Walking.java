package SoftUni.basics.whileLoop.exercises;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        int totalSteps = 0;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                totalSteps += stepsToHome;
                break;
            } else {
                totalSteps += Integer.parseInt(input);
            }
            if (totalSteps >= 10000) break;
        }

        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
        }
    }
}
