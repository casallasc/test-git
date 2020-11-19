package domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Player {
    private String name;
    private Integer number;

    public void print() {
        System.out.println("Player " + this.number + ": " + this.name );
    }
}
