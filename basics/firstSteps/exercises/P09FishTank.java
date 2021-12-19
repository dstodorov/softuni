package SoftUni.basics.firstSteps.exercises;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        float percent = scanner.nextFloat() / 100f;

        float tankVolume = length * width * height;
        float tankVolumeInLitters = tankVolume / 1000;
        System.out.println(tankVolumeInLitters * (1 - percent));
    }
}
