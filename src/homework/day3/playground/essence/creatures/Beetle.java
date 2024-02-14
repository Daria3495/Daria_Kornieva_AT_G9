package homework.day3.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {
    protected int mass;

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void nest(Carrot home) {
        if (mass < home.mass) {
            System.out.printf("I am %s", Beetle.class.getName() + "and I will nest there with %s my family members!", Carrot.class.getName());
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}