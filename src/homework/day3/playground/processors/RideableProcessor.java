package homework.day3.playground.processors;

import homework.day3.playground.essence.craft.Rideable;
import homework.day3.playground.utils.DirectionGenerator;

public class RideableProcessor {

    public void runRideable(Rideable rideable) {
        rideable.drive(DirectionGenerator.generateDirection());
    }

    public void runRideable(Rideable rideable, String direction) {
        rideable.drive(direction);
    }
}
