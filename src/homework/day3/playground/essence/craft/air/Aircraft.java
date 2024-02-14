package homework.day3.playground.essence.craft.air;

import homework.day3.playground.essence.Flyable;
import homework.day3.playground.essence.Matter;
import homework.day3.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {

    protected String name;

    public Aircraft() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
