package project.bubbles;

public class Bubble {
    public final double BUBBLE_VOLUME = 0.3;
    public String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void burstBubble() {
        System.out.println("Cramp!");
    }
}
