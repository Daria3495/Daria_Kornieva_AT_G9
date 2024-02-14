package homework.day3.playground.essence.craft.field;

import homework.day3.playground.essence.Matter;

public abstract class Vehicle extends Matter {

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
