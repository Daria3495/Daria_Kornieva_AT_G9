package homework.day3.playground.essence.creatures;

import homework.day3.playground.essence.Matter;

public abstract class Animal extends Matter {

    protected String name;

    public Animal(int mass, String name) {
        this.name=name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plant food) {
        System.out.printf("I am %s", Animal.class.getName() + "and eat %s", Plant.class.getName()).println();
    }
}
