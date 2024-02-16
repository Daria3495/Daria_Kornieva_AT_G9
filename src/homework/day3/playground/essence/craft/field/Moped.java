package homework.day3.playground.essence.craft.field;

public class Moped extends Vehicle {

    public Moped(int mass, String name) {
        super(mass, name);
    }

    public int move(int A, int B) {
        System.out.printf("I am %s, my name is %s and I am moving from point %s to point %s", this.getClass().getSimpleName(), this.getName(), A, B).println();
        return B - A;
    }
}
