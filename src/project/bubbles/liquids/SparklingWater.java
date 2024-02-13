package project.bubbles.liquids;

import project.bubbles.Bubble;
import project.bubbles.boxing.Bottle;

public class SparklingWater extends Water {
    Bubble bubbleComposition = new Bubble("CO2");
    private Bubble[] bubbles;
    private boolean isOpened;
    private int numberOfBubbles = 0;
    public SparklingWater(String color, int transparency, String smell, double temperature) {
        super(color, transparency, smell, temperature);
        isOpened();
    }
    private void degas() {
        if (numberOfBubbles != 0) {
            for (int i = 0; i < numberOfBubbles; i++) {
                bubbles[i].burstBubble();
                bubbles[i] = null;
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void isOpened() {
//        System.out.println();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles=bubbles;
        System.out.printf("Filled water with: %s", bubbles.length).println();
    }

    public void setOpened() {
        isOpened();
        degas();
    }

}
