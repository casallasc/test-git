package domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Player {
    private String name;
    private Integer number;

    public void sayHello() {
        System.out.println("Hello, my name is " + this.name );
    }
}
