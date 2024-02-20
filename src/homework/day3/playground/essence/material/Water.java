package homework.day3.playground.essence.material;

public class Water implements Pourable {

    protected int mass;

    public Water (int mass) {
        this.mass = mass;
    }

    public void spread(String storeName) {
        System.out.printf("I am %s and I am spreading in %s\n", this.getClass().getSimpleName(), storeName);
        System.out.println("whobl-whobl..");
    }

}
