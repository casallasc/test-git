package domain;

import com.github.javafaker.Faker;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Getter
@Builder
public class Team {
    private String name;
    private List<Player> players;

    public void print() {
        System.out.println("Team: " + this.name + "\n");
        this.players
                .forEach(Player::print);
    }

    public void initFakePlayers() {
        Faker faker = new Faker();
        this.players = IntStream.range(0, 11)
                .mapToObj(index ->  Player.builder()
                        .name(faker.name().firstName())
                        .number(index+1)
                        .team(this)
                        .build())
                .collect(Collectors.toList());
    }
}
