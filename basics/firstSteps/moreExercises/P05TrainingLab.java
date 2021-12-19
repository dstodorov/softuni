package SoftUni.basics.firstSteps.moreExercises;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workplaceWidth = 120;
        int workplaceHeight = 70;
        int corridorHeight = 100;

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        width *= 100;
        height *= 100;
        height -= corridorHeight;
        int rows = (int)width / workplaceWidth;
        int columns = (int)height / workplaceHeight;

        int seats = (rows * columns) - 3;
        System.out.printf("%d", seats);
    }
}
