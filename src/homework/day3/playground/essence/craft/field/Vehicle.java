package homework.day3.playground.essence.craft.field;

import homework.day3.playground.essence.Matter;
import homework.day3.playground.essence.craft.Rideable;
import homework.day3.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {

    protected String name;

    public Vehicle() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
