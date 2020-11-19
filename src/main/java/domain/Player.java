package domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Player {
    private String name;
    private Integer number;
    private Team team;

    public void print() {
        System.out.println("Player " + this.number + ": " + this.name );
    }

    public void intro() {
        System.out.println("\nMy name is " + this.name + ", my team is " + this.team.getName() + "!");
    }
}
