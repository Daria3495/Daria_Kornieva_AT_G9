package project.bubbles;

import project.bubbles.boxing.Bottle;
import project.bubbles.liquids.SparklingWater;
import project.bubbles.liquids.Water;

public class Runner {

    public static void main(String[] args) {

        Water water = new SparklingWater("no", 0,"no", 0);
        // почему не могу создать обьект воды Water water = new Sparkling water?

        Bottle bottle1 = new Bottle(0.05, 12);
        Bottle bottle2 = new Bottle(0.1, 18);
        Bottle bottle3 = new Bottle(0.2, 25);

        bottle1.setWater(new SparklingWater("no", 0,"no", 0));
        bottle1.setBubbles();
        bottle2.setWater(new SparklingWater("no", 0,"no", 0));
        bottle2.setBubbles();
        bottle3.setWater(new SparklingWater("no", 0,"no", 0));
        bottle3.setBubbles();

    }

}
