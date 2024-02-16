package homework.day3.playground.essence;

import homework.day3.playground.essence.creatures.Animal;

public interface Flyable {

    public default void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s", this.getClass().getSimpleName(), this.getClass().getSimpleName(),direction);
    }
}
