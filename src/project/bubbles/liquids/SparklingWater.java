package project.bubbles.liquids;

import project.bubbles.Bubble;
import project.bubbles.boxing.Bottle;

public class SparklingWater extends Water {
    Bubble bubbleComposition = new Bubble("CO2");
    private Bubble[] bubbles = new Bubble[10000];
    private boolean isOpened;
    public int numberOfBubbles;
    public SparklingWater(String color, int transparency, String smell, double temperature) {
        super(color, transparency, smell, temperature);
        isOpened();
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
                bubbles[i] = null;
            }
        }
    }

    public void isOpened(){
        System.out.println(isOpened);
    }

}
