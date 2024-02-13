package project.bubbles.liquids;

public abstract class Water {
    private String color;
    private String smell;
    private int transparency;
    private double temperature;

    public Water(String color, int transparency, String smell, double temperature) {
        this.color = color;
        this.smell = smell;
        this.transparency = transparency;
        this.temperature = temperature;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell() {
        this.smell = smell;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setTransparency() {
        this.transparency = transparency;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature() {
        this.temperature = temperature;
    }


}
