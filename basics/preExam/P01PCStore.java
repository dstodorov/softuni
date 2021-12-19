package SoftUni.basics.preExam;

import java.util.Scanner;

public class P01PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cpuPriceUSD = Double.parseDouble(scanner.nextLine());
        double gpuPriceUSD = Double.parseDouble(scanner.nextLine());
        double ramPriceUSD = Double.parseDouble(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double cpuPriceBGN = cpuPriceUSD * 1.57;
        double gpuPriceBGN = gpuPriceUSD * 1.57;
        double ramPriceBGN = ramPriceUSD * 1.57;

        double cpuPriceWithDiscount = cpuPriceBGN - (cpuPriceBGN * discount);
        double gpuPriceWithDiscount = gpuPriceBGN - (gpuPriceBGN * discount);

        double totalCost = cpuPriceWithDiscount + gpuPriceWithDiscount + (ramPriceBGN * ramCount);
        System.out.printf("Money needed - %.2f leva.", totalCost);
    }
}
