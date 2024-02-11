package project.bubbles;

public class Bottle {

public double bottleVolume;

public Bottle (double bottleVolume) {
    this.bottleVolume= bottleVolume;
}

SparklingWater sparklingWater = new SparklingWater();

public void open() {
    sparklingWater.degas();
}

}
