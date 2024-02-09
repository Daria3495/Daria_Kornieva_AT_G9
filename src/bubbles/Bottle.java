package bubbles;

public class Bottle {

public double bottleVolume;

SparklingWater sparklingWater = new SparklingWater();

public void open() {
    sparklingWater.degas();
}

}
