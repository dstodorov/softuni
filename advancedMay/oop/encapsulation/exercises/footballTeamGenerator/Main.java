package SoftUni.advancedMay.oop.encapsulation.exercises.footballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Team> teams = new LinkedHashMap<>();

        while (!input.equals("END")) {
            String[] inputParams = input.split(";");
            String command = inputParams[0];
            String teamName = inputParams[1];
            switch (command) {
                case "Team": {
                    Team team;
                    try {
                        team = new Team(teamName);
                        teams.put(teamName, team);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case "Add": {
                    if (isTeamExist(teams,teamName)) {
                        addPlayer(teams, inputParams, teamName);
                    } else {
                        showMessage(teamName);
                    }
                    break;
                }
                case "Remove": {
                    String playerName = inputParams[2];
                    if (isTeamExist(teams, teamName)) {
                        removePlayer(teams, teamName, playerName);
                    } else {
                        showMessage(teamName);
                    }
                    break;
                }
                case "Rating": {
                    if (isTeamExist(teams, teamName)) {
                        showTeamStats(teams, teamName);
                    } else {
                        showMessage(teamName);
                    }
                    break;
                }
            }
            input = scanner.nextLine();
        }
    }

    private static void showMessage(String param) {
        System.out.printf("Team %s does not exist.%n", param);
    }

    private static void showTeamStats(Map<String, Team> teams, String teamName) {
        double rating = teams.get(teamName).getRating();
        System.out.printf("%s - %d%n", teamName, Math.round(rating));
    }

    private static void addPlayer(Map<String, Team> teams, String[] inputParams, String teamName) {
        String playerName = inputParams[2];
        int endurance = Integer.parseInt(inputParams[3]);
        int sprint = Integer.parseInt(inputParams[4]);
        int dribble = Integer.parseInt(inputParams[5]);
        int passing = Integer.parseInt(inputParams[6]);
        int shooting = Integer.parseInt(inputParams[7]);
        try {
            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
            teams.get(teamName).addPlayer(player);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void removePlayer(Map<String, Team> teams, String teamName, String playerName) {
        Player player = teams.get(teamName).getPlayers().stream().filter(p -> p.getName().equals(playerName)).findFirst().orElse(null);
        if (player != null) {
            teams.get(teamName).removePlayer(playerName);
        } else {
            System.out.printf("Player %s is not in %s team.%n", playerName, teamName);
        }
    }

    private static boolean isTeamExist(Map<String, Team> teams, String teamName) {
        return teams.containsKey(teamName);
    }
}
