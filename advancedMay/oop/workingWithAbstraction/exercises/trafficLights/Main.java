package SoftUni.oop.workingWithAbstraction.exercises.trafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        List<TrafficLight> trafficLights = new ArrayList<>();
        for (String light : input) {
            trafficLights.add(new TrafficLight(light));
        }

        int numberOfUpdates = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfUpdates; i++) {
            updateLights(trafficLights);
        }
        System.out.println();
    }

    private static void updateLights(List<TrafficLight> trafficLights) {
        for (TrafficLight trafficLight : trafficLights) {
            trafficLight.update();
            printUpdatedLights(trafficLight);
        }
        System.out.println();
    }

    private static void printUpdatedLights(TrafficLight trafficLight) {
        System.out.print(trafficLight.getLight() + " ");
    }
}
