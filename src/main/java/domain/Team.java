package domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Team {
    private String name;
    private List<Player> players;

    public void print() {
        System.out.println("Team: " + this.name + "\n");
        this.players
                .forEach(Player::sayHello);
    }
}
