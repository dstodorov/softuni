package SoftUni.oopJune.encapsulation.lab.p04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Team team = new Team("Cherno more");
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            Person player = new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
            team.addPlayer(player);
        }
        System.out.printf("First team have %d players%n", team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n", team.getReserveTeam().size());
    }
}
