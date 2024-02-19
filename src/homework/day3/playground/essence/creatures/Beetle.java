package homework.day3.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {
    protected int mass;

    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void nest(Carrot home) {
        if (mass < home.mass) {
            System.out.printf("I am %s", this.getClass().getSimpleName() + "and I will nest there with %s my family members!", home.getName());
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }

    public void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %s units\n", this.getClass().getSimpleName(),
                getName(), direction, distance);
        System.out.println("vz-vz-vzz-zz..");
    }

}