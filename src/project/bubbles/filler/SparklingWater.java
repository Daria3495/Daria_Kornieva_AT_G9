package project.bubbles.filler;

import project.bubbles.Bubble;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.nCopies;

public class SparklingWater extends Water {
    Bubble bubbleComposition = new Bubble("CO2");
    private List<Bubble> bubbles;
    private boolean isOpened;

    public SparklingWater(String color, String transparency, String smell, double temperature) {
        super(color, transparency, smell, temperature);
        isOpened();
    }

    private void degas() {

        int numberOfBubblesToCramp = (int) (10 + 5 * getTemperature());
        while (!bubbles.isEmpty()) {
            if (bubbles.size() < numberOfBubblesToCramp) {
                numberOfBubblesToCramp = bubbles.size();
            }
            crampBubbles(numberOfBubblesToCramp);
            sleep();
            System.out.println("Number of bubbles left = " + bubbles.size());
        }
    }

    private void crampBubbles(int numberOfBubblesToCramp) {
        for (int i = 0; i < numberOfBubblesToCramp; i++) {
            bubbles.removeFirst().cramp();
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void isOpened() {
        isOpened = true;
        System.out.println("Bottle is opened");
    }

    public void pump(int numberOfBubbles) {
        this.bubbles = new ArrayList<>(nCopies(numberOfBubbles, new Bubble("CO2")));

        System.out.printf("Filled water with: %s bubbles \n", bubbles.size());
    }

    public void setOpened() {
        isOpened = true;
        System.out.println("Bottle is opened for degas");
        degas();
    }

}
