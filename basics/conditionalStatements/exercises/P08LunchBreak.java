import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int movieTime = Integer.parseInt(scanner.nextLine());
        int lunchBrake = Integer.parseInt(scanner.nextLine());

        float lunch = lunchBrake/8f;
        float rest = lunchBrake/4f;

        float freeTime = lunchBrake - lunch - rest;

        if(freeTime >= movieTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movieName, Math.ceil(freeTime - movieTime));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movieName, Math.ceil(movieTime - freeTime));
        }
    }
}
