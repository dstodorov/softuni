package SoftUni.fundamentalsJanuary.regularExpressions.exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> allowedParticipants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        Pattern participantNamePattern = Pattern.compile("[A-Z]|[a-z]");
        Pattern participantPointsPattern = Pattern.compile("\\d");

        Map<String, Integer> participants = new LinkedHashMap<>();

        while (!input.equals("end of race")) {
            StringBuilder participantName = new StringBuilder();
            Matcher nameMatcher = participantNamePattern.matcher(input);
            while (nameMatcher.find()) {
                participantName.append(nameMatcher.group());
            }

            int participantPoints = 0;
            Matcher participantPointsMatcher = participantPointsPattern.matcher(input);
            while (participantPointsMatcher.find()) {
                participantPoints += Integer.parseInt(participantPointsMatcher.group());
            }

            if (allowedParticipants.contains(participantName.toString())) {
                if (participants.containsKey(participantName.toString())) {
                    participants.put(participantName.toString(), participants.get(participantName.toString()) + participantPoints);
                } else {
                    participants.put(participantName.toString(), participantPoints);
                }
            }

            input = scanner.nextLine();
        }

        Map<String, Integer> results = participants.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        int counter = 1;
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            if (counter == 1) {
                System.out.printf("%dst place: %s%n", counter, entry.getKey());
            } else if (counter == 2) {
                System.out.printf("%dnd place: %s%n", counter, entry.getKey());
            } else if (counter == 3) {
                System.out.printf("%drd place: %s%n", counter, entry.getKey());
            }
            if (counter == 3) break;
            else counter++;
        }

    }
}
