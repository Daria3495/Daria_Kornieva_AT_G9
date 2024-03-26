package project.bubbles.boxing;

import project.bubbles.boxingMaterial.Material;
import project.bubbles.filler.Transformable;

public class Cup extends Vessel implements Containable{
    public Cup(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }

    @Override
    public void addStuff(Transformable stuff) {
        this.stuff = stuff;
        System.out.printf("Adding %s into Cup", stuff.getClass().getSimpleName()).println();
    }

    @Override
    public Transformable removeStuff() {
        Transformable newStuff = this.stuff;
        System.out.printf("Removing %s from Cup", stuff.getClass().getSimpleName()).println();
        this.stuff = null;
        return newStuff;
    }

    @Override
    public boolean isEmpty() {
        return stuff == null;
    }
}
