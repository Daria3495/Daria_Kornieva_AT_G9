package homework.day3.playground.essence.craft.field;

import homework.day3.playground.essence.Matter;
import homework.day3.playground.essence.craft.Rideable;
import homework.day3.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {

    protected String name;

    public Vehicle(int mass, String name) {
        this.mass = mass;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int move(int a, int b) {
        System.out.printf("I am %s, my name is %s and I am moving from point %s to point %s", this.getClass().getSimpleName(), this.getName(), a, b).println();
        return b - a;
    }

    public void drive(String direction) {
        System.out.printf("I am %s, my name is %s and I amd driving to %s\n", this.getClass().getSimpleName(), getName(), direction);
    }
}
