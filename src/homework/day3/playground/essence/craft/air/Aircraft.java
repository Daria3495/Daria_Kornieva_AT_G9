package homework.day3.playground.essence.craft.air;

import homework.day3.playground.essence.Flyable;
import homework.day3.playground.essence.Matter;
import homework.day3.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {

    protected String name;

    protected int mass;

    public Aircraft(int mass, String name) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s", this.getClass().getSimpleName(), this.getName(), direction).println();
    }
    public int move(int a, int b) {
        System.out.printf("I am %s, my name is %s and I am moving from point %s to point %s", this.getClass().getSimpleName(), this.getName(), a, b).println();
        return b - a;
    }

}
