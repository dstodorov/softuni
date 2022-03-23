package SoftUni.fundamentalsJanuary.associativeArrays.moreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P02Judge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> contests = new LinkedHashMap<>();
        Map<String, Integer> userStatistics = new LinkedHashMap<>();

        contests.put("Algo", new TreeMap<>());
        contests.get("Algo").put("Peter", 400);
        contests.get("Algo").put("George", 300);
        contests.get("Algo").put("Sam", 200);

        contests.put("DS", new TreeMap<>());
        contests.get("DS").put("Maria", 400);
        contests.get("DS").put("Peter", 300);

        userStatistics.put("Maria", 600);
        userStatistics.put("Peter", 550);
        userStatistics.put("George", 300);

//        String input = scanner.nextLine();
//        while (!input.equals("no more time")) {
//            String[] contestDetails = input.split(" -> ");
//
//            String username = contestDetails[0].trim();
//            String contestName = contestDetails[1].trim();
//            int points = Integer.parseInt(contestDetails[2].trim());
//
//            //System.out.printf("%s -> %s -> %d%n", username, contestName, points);
//            input = scanner.nextLine();
//        }

        //TODO: Processing
        // - Check if user exist
        //   - Yes -
        //       - Check if user is signed to this contest
        //         - Yes
        //           - Check if score is higher
        //             - Yes
        //               - Do nothing
        //             - No
        //               - Update
        //         - No
        //             - Add it

        //   - No
        //     - Add user

        //TODO: Print

        printContests(contests);
        printStatistics(userStatistics);
    }

    private static void printStatistics(Map<String, Integer> userStatistics) {
        int row = 1;
        System.out.println("Individual standings:");
        for (Map.Entry<String, Integer> userStats : userStatistics.entrySet()) {
            System.out.printf("%d. %s -> %d%n", row, userStats.getKey(), userStats.getValue());
        }
    }

    private static void printContests(Map<String, Map<String, Integer>> contests) {
        for (Map.Entry<String, Map<String, Integer>> contest : contests.entrySet()) {
            System.out.printf("%s: %d participants%n", contest.getKey(), contests.entrySet().size());
            int row = 1;
            for (Map.Entry<String, Integer> participant : contest.getValue().entrySet()) {
                System.out.printf("%d. %s <::> %d%n", row, participant.getKey(), participant.getValue());
                row++;
            }
        }
    }
}
