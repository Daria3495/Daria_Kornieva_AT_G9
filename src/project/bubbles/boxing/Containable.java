package project.bubbles.boxing;

import project.bubbles.filler.Transformable;

public interface Containable {
    void addStuff(Transformable stuff);

    Transformable removeStuff();

    boolean isEmpty();
}
