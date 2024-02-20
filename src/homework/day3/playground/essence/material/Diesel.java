package homework.day3.playground.essence.material;

public class Diesel implements Pourable, Powerable {

    protected int mass;

    public Diesel (int mass) {
        this.mass = mass;
    }

    @Override
    public void spread(String storeName) {
        System.out.printf("I am %s and I am spreading in %s\n", this.getClass().getSimpleName(), storeName);
        System.out.println("whooh..");
    }
}
