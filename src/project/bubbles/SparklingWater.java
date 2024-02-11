package project.bubbles;

public class SparklingWater extends Water {
    Bubble bubbleComposition = new Bubble("CO2");
    public Bubble[] bubbles = new Bubble[10000];

    public int numberOfBubbles;

    public SparklingWater(String color, int transparency, String smell, double temperature) {
        super(color, transparency, smell, temperature);
    }

    public void pump(Bottle bottle) {
        double bottleVolume = bottle.getBottleVolume();
        for (int i = 0; i < bubbles.length * bottleVolume; i++) {
            bubbles[i] = new Bubble("CO2");
            i = numberOfBubbles;
        }
    }

    public void degas() {
        if (numberOfBubbles != 0) {
            for (int i = 0; i < numberOfBubbles; i++) {
                bubbles[i].burstBubble();
                bubbles[i]=null;
            }
        }
    }

}
