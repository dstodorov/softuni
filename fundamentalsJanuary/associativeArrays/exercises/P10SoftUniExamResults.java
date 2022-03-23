package SoftUni.fundamentalsJanuary.associativeArrays.exercises;

import java.util.*;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Submission>> exams = new LinkedHashMap<>();
        Map<String, Integer> submissions = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("exam finished")) {
            String[] submissionDetails = input.split("-");
            String username = submissionDetails[0];

            if (!input.contains("banned")) {
                String language = submissionDetails[1];
                int score = Integer.parseInt(submissionDetails[2]);
                exams.putIfAbsent(username, new ArrayList<>());

                Submission submission = new Submission(language, score);
                exams.get(username).add(submission);

                if (submissions.containsKey(language)) {
                    submissions.put(language, submissions.get(language) + 1);
                } else {
                    submissions.put(language, 1);
                }
            } else {
                exams.remove(username);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results: ");
        for (Map.Entry<String, List<Submission>> entry : exams.entrySet()) {

            OptionalInt max = Arrays.stream(entry.getValue().stream().mapToInt(Submission::getScore).toArray()).max();

            System.out.print(entry.getKey() + " | " + max.getAsInt() + "\n");
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : submissions.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    static class Submission {
        private String language;

        public int getScore() {
            return score;
        }

        private int score;

        public Submission(String language, int score) {
            this.language = language;
            this.score = score;
        }
    }
}