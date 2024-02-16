package homework.day3.playground.essence.craft.air;

public class Copter extends Aircraft {

    public Copter(int weight, String name) {
        super(weight, name);
    }

    @Override
    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s", this.getClass().getSimpleName(), this.getName(), direction).println();
    }
}
