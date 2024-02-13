package project.bubbles.boxing;

import project.bubbles.Bubble;
import project.bubbles.liquids.SparklingWater;
import project.bubbles.liquids.Water;

public class Bottle {
    private double bottleVolume;
    private Water water;

    public Bottle(double bottleVolume, int temperature) {
        this.bottleVolume = bottleVolume;
    }

    public double getBottleVolume() {
        return bottleVolume;
    }

    public void open() {
        ((SparklingWater) water).setOpened();
    }

    public void warm(int temperature) {

    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void setBubbles() {
        ((SparklingWater) water).pump(countNumberOfBubbles());
    }

    private Bubble[] countNumberOfBubbles() {
        double bottleVolume = getBottleVolume();
        int numberOfBubbles = (int) (bottleVolume * 10000);
        Bubble[] bubbles = new Bubble[numberOfBubbles];

        for (int i = 0; i < numberOfBubbles; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        return bubbles;
    }
}
