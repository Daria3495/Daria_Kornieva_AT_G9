package project.bubbles.boxing;

import project.bubbles.boxingMaterial.Material;
import project.bubbles.filler.Transformable;

public abstract class Vessel {

    private double volume;
    private double diameter;
    private int weight;
    private Material material;
    protected Transformable stuff;

    public Vessel(double volume, double diameter, int weight, Material material) {
        this.volume = volume;
        this.weight = weight;
        this.material = material;
        this.diameter = (int) ((volume * this.material.getDensity())) / diameter;
    }

    public double getVolume() {
        System.out.printf("Getting %s volume: %s", this.getClass().getSimpleName(), volume).println();
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        System.out.printf("Getting %s diameter: %s", this.getClass().getSimpleName(), diameter).println();
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        System.out.printf("Getting %s weight: %s", this.getClass().getSimpleName(), weight).println();
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        System.out.printf("Getting %s material: %s", this.getClass().getSimpleName(), material).println();
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
