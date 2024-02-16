package homework.day3.playground.essence.creatures;

public abstract class Vertebrata extends Animal {

    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat(Insect food) {
        System.out.printf("I am %s", Vertebrata.class.getName() + "I am eating " + Insect.class.getName());
    }
}
