package project.bubbles;

public class Bubble {
    private final double BUBBLE_VOLUME = 0.3;
    private String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void burstBubble() {
        System.out.println("Cramp!");
    }

    public double getBUBBLE_VOLUME() {
        return BUBBLE_VOLUME;
    }

    public String getGasComposition() {
        return gasComposition;
    }

    public void setGasComposition() {
        this.gasComposition = gasComposition;
    }

}
