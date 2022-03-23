package SoftUni.fundamentalsJanuary.associativeArrays.moreExercises;

import java.util.*;

public class P01Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contests = new LinkedHashMap<>();
        Map<String, Contender> contenders = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end of contests")) {
            String[] contestDetails = input.split(":");
            String contestName = contestDetails[0];
            String contestPassword = contestDetails[1];

            contests.putIfAbsent(contestName, contestPassword);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("end of submissions")) {
            String[] candidateDetails = input.split("=>");
            String contest = candidateDetails[0];
            String password = candidateDetails[1];
            String username = candidateDetails[2];
            int points = Integer.parseInt(candidateDetails[3]);

            String getContest = contests.get(contest);
            if (getContest != null && contests.get(contest).equals(password)) {
                contenders.putIfAbsent(username, new Contender(new LinkedHashMap<>()));
                if (contenders.get(username).getContests().containsKey(contest)) {
                    int currentContestMaxScore = contenders.get(username).getContestMaxScore(contest);
                    if (currentContestMaxScore < points) {
                        contenders.get(username).getContests().put(contest, points);
                    }
                } else {
                    contenders.get(username).getContests().put(contest, points);
                }
            }

            input = scanner.nextLine();
        }

        printBestCandidate(contenders);
        printContenders(contenders);

        System.out.println();
    }

    private static void printContenders(Map<String, Contender> contenders) {
        System.out.println("Ranking:");
        for (Map.Entry<String, Contender> contender : contenders.entrySet()) {
            System.out.println(contender.getKey());
            Map<String, Integer> contest = contender.getValue().getContests();
            LinkedHashMap<String, Integer> sortedResultByPoints = new LinkedHashMap<>();

            contest.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x -> sortedResultByPoints.put(x.getKey(), x.getValue()));

            for (Map.Entry<String, Integer> entry : sortedResultByPoints.entrySet()) {
                System.out.printf("#  %s -> %d%n", entry.getKey(), entry.getValue());
            }
        }
    }

    private static void printBestCandidate(Map<String, Contender> contenders) {
        String bestCandidateName = "n/a";
        int bestCandidatePoints = 0;
        for (Map.Entry<String, Contender> contenderMap : contenders.entrySet()) {
            if (contenderMap.getValue().getTotalPoints() > bestCandidatePoints) {
                bestCandidateName = contenderMap.getKey();
                bestCandidatePoints = contenderMap.getValue().getTotalPoints();
            }
        }

        System.out.printf("Best candidate is %s with total %s points.%n", bestCandidateName, bestCandidatePoints);
    }

    static class Contender {

        public Map<String, Integer> getContests() {
            return contests;
        }

        private Map<String, Integer> contests;

        public Contender(Map<String, Integer> contests) {
            this.contests = contests;
        }

        public int getContestMaxScore(String contest) {
            int max = 0;

            if (this.contests.containsKey(contest)) {
                for (Map.Entry<String, Integer> entry : contests.entrySet()) {
                    if (entry.getValue() > max) max = entry.getValue();
                }
            }
            return max;
        }

        public int getTotalPoints () {
            int total = 0;
            for (Map.Entry<String, Integer> entry : contests.entrySet()) {
                total += entry.getValue();
            }

            return total;
        }
    }
}


