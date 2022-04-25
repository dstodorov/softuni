package SoftUni.advancedMay.stacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        String filename = scanner.nextLine();

        while (!filename.equals("print")) {
            if (filename.equals("cancel")) {
                if (printerQueue.size() == 0) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerQueue.peek());
                    printerQueue.poll();
                }
            } else {
                printerQueue.add(filename);
            }
            filename = scanner.nextLine();
        }

        while (printerQueue.size() > 0) {
            System.out.println(printerQueue.poll());
        }
    }
}
