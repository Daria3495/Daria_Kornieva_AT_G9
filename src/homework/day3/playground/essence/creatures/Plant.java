package homework.day3.playground.essence.creatures;

import homework.day3.playground.essence.Matter;

public abstract class Plant extends Matter {

    protected String name;

    public Plant() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
