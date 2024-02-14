package homework.day3.playground.essence.craft.hand;

import homework.day3.playground.essence.Matter;

public abstract class Container extends Matter {

    protected String name;

    public Container() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }
}
