package project.bubbles;

public class Bubble {

    public final double BUBBLE_VOLUME = 0.3;

    public int gasComposition;

    public Bubble (int gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void burstBubble() {
        System.out.println("Cramp!");
    }
}
