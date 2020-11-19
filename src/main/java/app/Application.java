package app;

import com.github.javafaker.Faker;
import domain.Team;

public class Application {
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
        team.getPlayers().get(0).intro();
    }
}
