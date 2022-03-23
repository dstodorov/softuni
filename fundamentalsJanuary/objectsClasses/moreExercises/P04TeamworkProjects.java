package SoftUni.fundamentalsJanuary.objectsClasses.moreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class P04TeamworkProjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTeams = Integer.parseInt(scanner.nextLine());

        List<Team> teamList = new ArrayList<>();
        for (int i = 0; i < numberOfTeams; i++) {
            String[] teamDetails = scanner.nextLine().split("-");
            String teamCreator = teamDetails[0];
            String teamName = teamDetails[1];

            if (!isTeamExist(teamList, teamName)) {
                if (!isUserHasTeam(teamList, teamCreator)) {
                    registerTeam(teamList, teamName, teamCreator);
                }
            } else {
                System.out.printf("Team %s was already created!%n", teamName);
            }
        }

        String assignment = scanner.nextLine();

        while (!assignment.equals("end of assignment")) {
            String[] assignmentDetails = assignment.split("->");
            String user = assignmentDetails[0];
            String teamName = assignmentDetails[1];
            if (isTeamExist(teamList, teamName)) {
                if (!isMemberOfAnotherTeam(teamList, user)) {
                    addMember(teamList, teamName, user);
                } else {
                    System.out.printf("Member %s cannot join team %s!%n", user, teamName);
                }
            } else {
                System.out.printf("Team %s does not exist!%n", teamName);
            }
            assignment = scanner.nextLine();
        }

        sortTeamsByNameAscending(teamList);
        printReport(teamList);
    }

    private static void sortTeamsByNameAscending(List<Team> teamList) {
        for (Team team : teamList) {
            List<String> users = team.getUsers();
            Collections.sort(users);
            //Collections.reverse(users);
        }
    }

    private static void printReport(List<Team> teamList) {
        List<Team> teamsToPrint = teamList
                .stream()
                .filter(team -> team.getNumberOfPeople() > 1)
                .sorted(Comparator.comparing(Team::getNumberOfPeople)
                        .reversed().thenComparing(Team::getTeamName))
                .collect(Collectors.toList());
        List<Team> teamsToDisband = teamList
                .stream()
                .filter(team -> team.getNumberOfPeople() < 2)
                .sorted(Comparator.comparing(Team::getTeamName))
                .collect(Collectors.toList());

        printTeam(teamsToPrint);
        printDisbandedTeams(teamsToDisband);
    }

    private static void printDisbandedTeams(List<Team> teams) {
        System.out.println("Teams to disband:");
        for (Team team : teams) {
            System.out.println(team.getTeamName());
        }
    }

    private static void printTeam(List<Team> teams) {
        for (Team team : teams) {
            team.printTeam();
        }
    }

    private static void addMember(List<Team> teamList, String teamName, String user) {
        for (Team team : teamList) {
            if (team.getTeamName().equals(teamName)) {
                team.getUsers().add(user);
            }
        }
    }

    private static boolean isMemberOfAnotherTeam(List<Team> teamList, String user) {
        for (Team team : teamList) {
            for (String name : team.getUsers()) {
                if (name.equals(user)) return true;
            }
        }
        return false;
    }

    private static void registerTeam(List<Team> teamList, String teamName, String teamCreator) {
        List<String> team = new ArrayList<>();
        team.add(teamCreator);
        teamList.add(new Team(teamCreator, teamName, team));
        System.out.printf("Team %s has been created by %s!%n", teamName, teamCreator);
    }

    private static boolean isUserHasTeam(List<Team> teamList, String teamCreator) {
        for (Team team : teamList) {
            if (team.getTeamCreator().equals(teamCreator)) {
                System.out.printf("%s cannot create another team!%n", teamCreator);
                return true;
            }
        }
        return false;
    }

    private static boolean isTeamExist(List<Team> teamList, String teamName) {
        for (Team team : teamList) {
            if (team.getTeamName().equals(teamName)) return true;
        }
        return false;
    }

    static class Team {
        private String teamCreator;
        private String teamName;
        private List<String> users;

        public List<String> getUsers() {
            return users;
        }


        public Team(String teamCreator, String teamName, List<String> users) {
            this.teamCreator = teamCreator;
            this.teamName = teamName;
            this.users = users;
        }

        public String getTeamCreator() {
            return teamCreator;
        }

        public String getTeamName() {
            return teamName;
        }

        public int getNumberOfPeople() {
            return this.users.size();
        }

        public void printTeam() {
            System.out.println(this.teamName);
            System.out.println("- " + this.teamCreator);
            for (int i = 0; i < this.users.size(); i++) {
                if (i != this.users.size() - 1) {
                    if (!this.users.get(i).equals(this.teamCreator)) {
                        System.out.println("-- " + this.users.get(i));
                    }
                } else {
                    if (!this.users.get(i).equals(this.teamCreator)) {
                        System.out.println("-- " + this.users.get(i));
                    }
                }
            }
        }
    }
}
