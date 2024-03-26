package project.bubbles.filler;

public abstract class Water implements Transformable{
    private String color = "no";
    private String smell = "no";
    private String transparency = "transparent";
    private double temperature = 0;

    public Water(String color, String transparency, String smell, double temperature) {
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

    public String getTransparency() {
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
