package homework.day3.playground.processors;

import homework.day3.playground.essence.Flyable;

import static homework.day3.playground.utils.DirectionGenerator.generateDirection;

public class FlyableProcessor {

    public void runFlyable(Flyable flyable) {
        flyable.fly(generateDirection());
    }

    public void runFlyable(Flyable flyable, String direction){
        runFlyable(flyable,direction);
    }
}
