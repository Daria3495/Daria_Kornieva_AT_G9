package homework.day3.playground.essence.creatures;

import java.io.Serializable;

public abstract class Insect extends Animal {


    public Insect(int mass, String name) {
        super(mass,name);
    }

    protected Insect() {
    }
}
