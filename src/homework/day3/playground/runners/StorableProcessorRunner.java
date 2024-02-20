package homework.day3.playground.runners;

import homework.day3.playground.essence.Matter;
import homework.day3.playground.essence.craft.hand.Bottle;
import homework.day3.playground.essence.craft.hand.Can;
import homework.day3.playground.essence.craft.hand.Container;
import homework.day3.playground.essence.craft.hand.Storable;
import homework.day3.playground.essence.material.*;
import homework.day3.playground.processors.StorableProcessor;

public class StorableProcessorRunner {

    public static void main(String[] args) {

        StorableProcessor storableProcessor = new StorableProcessor();

        Bottle bottle = new Bottle(23, "Glass");
        Storable storableBottle = new Bottle(4, "Plastic");
        Container containerBottle = new Bottle(78, "Metal");
        Matter matterBottle = new Bottle(33, "Blue");
        Can can = new Can(23, "Wooden");
        Storable storableCan = new Can(82, "Small");
        Container containerCan = new Can(54, "Big");
        Matter matterCan = new Can(8, "Old");

        Petrol petrol = new Petrol(11);
        Pourable pourablePetrol = new Petrol(65);
        Pourable pourableDiesel = new Diesel(3);
        Powerable powerableDiesel = new Diesel(87);
//        Matter matterPetrol = new Petrol(2); // Petroll does not extend or implement Matter class
        Water water = new Water(34);
        Pourable pourableWater = new Water(37);

        storableProcessor.runStorable(bottle, petrol);
        storableProcessor.runStorable(storableBottle, pourablePetrol);
        storableProcessor.runStorable((Storable) containerBottle, pourableDiesel);
        storableProcessor.runStorable((Storable) matterBottle, (Pourable) powerableDiesel);
        storableProcessor.runStorable(can, water);
        storableProcessor.runStorable(storableCan, pourableWater);
        storableProcessor.runStorable((Storable) containerCan, pourableDiesel);
        storableProcessor.runStorable((Storable) matterCan, pourablePetrol);

        storableProcessor.runStorable(can, (Pourable) powerableDiesel, 34);

    }

}
