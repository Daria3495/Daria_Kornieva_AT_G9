package basetask;

public class Obstacle {

    private String description;

    private String severity;

    public Obstacle(String description, String severity) {
        this.description = description;
        this.severity = severity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getSeverity() {
        return severity;
    }

    public static void printObstacleDetails(String description, String severity) {
        System.out.println("Возникло " + severity + " препятствие" + description);
    }

}
