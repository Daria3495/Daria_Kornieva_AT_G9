package homework.day3.playground.essence.craft.air;

public class Plane extends Aircraft {

    public Plane(int mass, String name) {
        super(mass,name);
    }

    @Override
    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s", this.getClass().getSimpleName(), this.getName(), direction).println();
    }

    public int move(int A, int B) {
        System.out.printf("I am %s, my name is %s and I am moving from point %s to point %s", this.getClass().getSimpleName(), this.getName(), A, B).println();
        return B - A;
    }
}
