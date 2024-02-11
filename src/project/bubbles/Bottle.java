package project.bubbles;

public class Bottle {

    public double bottleVolume;
    SparklingWater sparklingWater = new SparklingWater("white", 20,"sweet", 36.6);
    public Bottle(double bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    public double getBottleVolume() {
        return bottleVolume;
    }

    public void open() {
        sparklingWater.degas();
    }

}
