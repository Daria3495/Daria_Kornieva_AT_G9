package homework.day3.playground.essence.craft.hand;

import homework.day3.playground.essence.material.Pourable;

public class Can extends Container implements Storable {

    public Can (int mass, String name) {
        super(mass, name);
    }

    public void store(Pourable pourable, int amount) {
        pourable.spread(getName());
        System.out.printf("I am %s, my name is %s and I received %s of %s\n", this.getClass().getSimpleName(),
                getName(), amount, pourable.getClass().getSimpleName());

        if (amount > mass) {
            System.out.println("waah-waah-waah-hh..");
        }
    }
}
