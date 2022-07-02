package SoftUni.advancedMay.oop.encapsulation.exercises.footballTeamGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) throw new IllegalArgumentException("A name should not be empty.");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String name) {
        this.players.stream().filter(p -> p.getName().equals(name)).findFirst().ifPresent(player -> this.players.remove(player));
    }

    public double getRating() {
        return this.players.stream().mapToDouble(Player::overallSkillLevel).sum() / 5;
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(this.players);
    }
}
