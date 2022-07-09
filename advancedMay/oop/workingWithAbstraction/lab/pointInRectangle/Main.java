package SoftUni.advancedMay.oop.workingWithAbstraction.lab.pointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] rectangleCoordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Rectangle rectangle = new Rectangle(new Point(rectangleCoordinates[0], rectangleCoordinates[1]), new Point(rectangleCoordinates[2], rectangleCoordinates[3]));

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Point point = new Point(pointCoordinates[0], pointCoordinates[1]);
            System.out.println(rectangle.contains(point));
        }

    }
}
