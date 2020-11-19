package domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Team {
    private String name;
    private List<Player> players;

    public void printPlayers() {
        this.players.stream()
                .map(Player::getName)
                .forEach(System.out::println);
    }
}
