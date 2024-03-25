package project.bubbles.boxing;

import project.bubbles.Bubble;
import project.bubbles.boxingMaterial.Glass;
import project.bubbles.boxingMaterial.Material;
import project.bubbles.filler.SparklingWater;
import project.bubbles.filler.Transformable;
import project.bubbles.filler.Water;

import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable {
    private double bottleVolume;
    private Water water;

    public Bottle(double volume, double diameter, int weight, Material material) {
                super(volume, diameter, weight, material);
    }

    public double getBottleVolume() {
        return bottleVolume;
    }

    public void open() {
        if (stuff instanceof SparklingWater) {
            ((SparklingWater) stuff).setOpened();
        }
    }
    // почему тут нужен инстанс офф

    public void warm(int temperature) {
        System.out.printf("Warming water to: %s", temperature).println();
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void setBubbles() {
        if (stuff instanceof SparklingWater) {
            ((SparklingWater) stuff).pump(countNumberOfBubbles());
        }
    }

//    private Bubble[] countNumberOfBubbles() {
//        int numberOfBubbles = (int) (getVolume() * 10000);
//        Bubble[] bubbles = new Bubble[numberOfBubbles];
//
//        for (int i = 0; i < numberOfBubbles; i++) {
//            bubbles[i] = new Bubble("CO2");
//        }
//        return bubbles;
//    }

    private int countNumberOfBubbles() {
        return (int) (getVolume() * 10000);
//        List<Bubble> bubbles = new ArrayList<>(numberOfBubbles);

//        for (int i = 0; i < numberOfBubbles; i++) {
//            bubbles.add(new Bubble("CO2"));
//        }

    }

    @Override
    public void addStuff(Transformable stuff) {
        this.stuff = stuff;
        if (stuff instanceof SparklingWater) {
            setBubbles();
        }
        System.out.printf("Adding %s into Bottle", stuff.getClass().getSimpleName()).println();
    }

    @Override
    public Transformable removeStuff() {
        Transformable newStuff = this.stuff;
        System.out.printf("Removing %s from Bottle", stuff.getClass().getSimpleName()).println();
        this.stuff = null;
        return newStuff;
    }

    @Override
    public boolean isEmpty() {
        return stuff == null;
    }
}
