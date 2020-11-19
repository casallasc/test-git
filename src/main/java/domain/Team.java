package domain;

import com.github.javafaker.Faker;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Getter
@Builder
public class Team {
    final int MAX = 10;
    final int MIN = 1;

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

    public void introRandomPlayer() {
        Random random = new Random();
        this.players.get(random.nextInt(MAX - MIN + 1) + MIN).intro();
    }
}
