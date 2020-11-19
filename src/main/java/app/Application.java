package app;

import com.github.javafaker.Faker;
import domain.Player;
import domain.Team;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {

        Application app = new Application();
        app.init();
    }

    public void init() {
        Faker faker = new Faker();

        List<Player> players = IntStream.range(0, 11)
                .mapToObj(index ->  Player.builder()
                        .name(faker.name().firstName())
                        .number(index+1)
                        .build())
                .collect(Collectors.toList());

        Team team = Team.builder()
                .players(players)
                .name(faker.team().name())
                .build();

        team.printPlayers();
    }
}
