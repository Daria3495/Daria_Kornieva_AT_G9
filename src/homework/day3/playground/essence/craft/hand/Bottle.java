package homework.day3.playground.essence.craft.hand;

import homework.day3.playground.essence.material.Pourable;

public class Bottle extends Container implements Storable {

    public void store(Pourable pourable, int amount) {
        pourable.spread("");
        System.out.printf("I am %s, my name is %s and I received %s of $s", this.getClass().getSimpleName(),
                getName(), amount, pourable.getClass().getSimpleName());

        if (amount >) {
            System.out.println("wooh-wooh-wooh-hh..");
        }
    }

}
