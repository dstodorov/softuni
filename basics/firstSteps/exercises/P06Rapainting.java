package SoftUni.basics.firstSteps.exercises;

import java.util.Scanner;

public class P06Rapainting {
    public static void main(String[] args) {
        float NYLON_PRICE = 1.5f;
        float PAINT_PRICE = 14.5f;
        float THINNER_PRICE = 5f;

        Scanner scanner = new Scanner(System.in);

        int nylon = scanner.nextInt();
        int paint = scanner.nextInt();
        int thinner = scanner.nextInt();
        int hours = scanner.nextInt();

        float totalNylon = NYLON_PRICE * (nylon + 2);
        float totalPaint = PAINT_PRICE * (paint + (paint * 0.1f));
        float totalThinner = THINNER_PRICE * thinner;

        float totalAmount = totalNylon + totalPaint + totalThinner + 0.4f;
        float workersCost = totalAmount * (30f/100f) * hours;

        System.out.println(totalAmount + workersCost);
    }
}
