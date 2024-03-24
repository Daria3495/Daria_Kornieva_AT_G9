package project.bubbles;

import project.bubbles.boxing.Bottle;
import project.bubbles.boxingMaterial.Glass;
import project.bubbles.boxingMaterial.Material;
import project.bubbles.boxingMaterial.Metal;
import project.bubbles.boxingMaterial.Plastic;
import project.bubbles.filler.SparklingWater;
import project.bubbles.filler.Transformable;
import project.bubbles.filler.Water;

public class Factory {

    public static void main(String[] args) {

        Water water = new SparklingWater("no", "transparent","no", 10);

        Bottle bottle1 = new Bottle(0.05, 12, 25, new Glass());
        Bottle bottle2 = new Bottle(0.1, 18, 10, new Plastic());
        Bottle bottle3 = new Bottle(0.2, 25, 15, new Metal());

        bottle1.addStuff(water);
        bottle1.open();

        bottle2.addStuff(water);
        bottle2.open();

        bottle3.addStuff(water);
        bottle3.open();

    }

}
