package homework.day3.playground.essence.creatures;

public abstract class Vertebrata extends Animal {

    public void eat(Insect food) {
        System.out.printf("I am %s", Vertebrata.class.getName() + "I am eating " + Insect.class.getName());
    }
}
