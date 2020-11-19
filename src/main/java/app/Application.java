package app;

import com.github.javafaker.Faker;
import domain.Team;

import java.util.Random;

public class Application {
    final int MAX = 10;
    final int MIN = 1;

    public static void main(String[] args) {

        Application app = new Application();
        app.run();
    }

    public void run() {
        Faker faker = new Faker();

        Team team = Team.builder()
                .name(faker.team().name())
                .build();

        team.initFakePlayers();
        team.print();
        Random random = new Random();
        team.getPlayers().get(random.nextInt(MAX - MIN + 1) + MIN).intro();
    }
}
