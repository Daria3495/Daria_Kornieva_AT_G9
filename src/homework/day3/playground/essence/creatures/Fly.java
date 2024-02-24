package homework.day3.playground.essence.creatures;

import homework.day3.playground.essence.Flyable;

import java.io.Serializable;

public class Fly extends Insect implements Flyable, Serializable {

//    private static final long serialVersionUID = -5612093780891496020L;
    public Fly() {
    }

    public Fly(int mass, String name) {
        super(mass, name);
    }

    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s", this.getClass().getSimpleName(), this.getName(), direction).println();
    }

    @Override
    public String toString() {
        return "Fly{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
