package project.bubbles.filler;

import project.bubbles.Bubble;

public class SparklingWater extends Water {
    Bubble bubbleComposition = new Bubble("CO2");
    private Bubble[] bubbles;
    private boolean isOpened;

    public SparklingWater(String color, String transparency, String smell, double temperature) {
        super(color, transparency, smell, temperature);
        isOpened();
    }

    private void degas(Bubble[] bubbles) {
        int tempBubbles = bubbles.length;
        int numberOfBubblesToCramp = (int) (10 + 5 * getTemperature());
        if (tempBubbles != 0) {
            for (int i = 0; i < bubbles.length; i++) {
                bubbles[i].cramp(numberOfBubblesToCramp);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
                tempBubbles -= numberOfBubblesToCramp;
                System.out.println("Number of bubbles left = " + tempBubbles);
            }
        }
    }

    private void isOpened() {
        isOpened = true;
        System.out.println("Bottle is opened");
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        System.out.printf("Filled water with: %s bubbles", bubbles.length).println();
    }

    public void setOpened() {
        isOpened = true;
        System.out.println("Bottle is opened for degas");
        degas(bubbles);
    }

}
