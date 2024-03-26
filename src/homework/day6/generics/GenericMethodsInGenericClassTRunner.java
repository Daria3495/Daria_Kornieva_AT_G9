package homework.day6.generics;

import homework.day3.playground.essence.craft.air.Copter;
import homework.day3.playground.essence.craft.air.Plane;
import homework.day3.playground.essence.craft.air.Rocket;
import homework.day3.playground.essence.craft.field.Car;
import homework.day3.playground.essence.craft.field.Moped;
import homework.day3.playground.essence.craft.field.Motorbike;
import homework.day3.playground.essence.craft.hand.Can;
import homework.day3.playground.essence.craft.hand.Mug;
import homework.day3.playground.essence.creatures.*;
import project.bubbles.boxing.Bottle;
import project.bubbles.boxingMaterial.Glass;
import project.bubbles.boxingMaterial.Material;
import project.bubbles.boxingMaterial.Metal;
import project.bubbles.boxingMaterial.Plastic;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> stringObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> integerObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleObject = new GenericMethodsInGenericClassT<>();
//        GenericMethodsInGenericClassT<Aircraft> aircraftObject = new GenericMethodsInGenericClassT<>(); абстрактный класс не может содержать обьект
        GenericMethodsInGenericClassT<Copter> copterObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plane> planeObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> rocketObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Car> carObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> mopedObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> motorbikeObject = new GenericMethodsInGenericClassT<>();
//        GenericMethodsInGenericClassT<Vehicle> vehicleObject = new GenericMethodsInGenericClassT<>(); abstract
        GenericMethodsInGenericClassT<Bottle> bottleObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> canObject = new GenericMethodsInGenericClassT<>();
//        GenericMethodsInGenericClassT<Container> containerObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> mugObject = new GenericMethodsInGenericClassT<>();
//        GenericMethodsInGenericClassT<Animal> animalObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Beetle> beetleObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Carrot> carrotObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Chamomile> chamomileObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crocodile> crocodileObject = new GenericMethodsInGenericClassT<>();
//        GenericMethodsInGenericClassT<Flower> flowerObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Fly> flyObject = new GenericMethodsInGenericClassT<>();
//        GenericMethodsInGenericClassT<Insect> insectObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Maylily> maylilyObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mosquito> mosquitoObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pigeon> pigeonObject = new GenericMethodsInGenericClassT<>();
//        GenericMethodsInGenericClassT<Plant> plantObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Potato> potatoObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Radish> radishObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Raven> ravenObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rose> roseObject = new GenericMethodsInGenericClassT<>();
//        GenericMethodsInGenericClassT<Vegetable> vegetableObject = new GenericMethodsInGenericClassT<>();
//        GenericMethodsInGenericClassT<Vertebrata> vertebrataObject = new GenericMethodsInGenericClassT<>();
//        GenericMethodsInGenericClassT<Matter> matterObject = new GenericMethodsInGenericClassT<>();  абстрактный класс
//        GenericMethodsInGenericClassT<Flyable> flyableObject = new GenericMethodsInGenericClassT<>();  интерфейс

        stringObject.genericMethodOneGenArg("some text");
        System.out.println(stringObject.genericMethodTwoGenArgs("a", "b"));
        stringObject.genericMethodHalfGenArgs("a","b");

        integerObject.genericMethodOneGenArg(1);
        System.out.println(integerObject.genericMethodTwoGenArgs(4,78));
        integerObject.genericMethodHalfGenArgs(6,"yuammy");

        doubleObject.genericMethodOneGenArg(7.9);
        System.out.println(doubleObject.genericMethodTwoGenArgs(84.9,34.6));
        doubleObject.genericMethodHalfGenArgs(74.9, "let's talk");

        copterObject.genericMethodOneGenArg(new Copter(675,"Air"));
        System.out.println(copterObject.genericMethodTwoGenArgs(new Copter(678, "Baltic"), new Copter(839,"Wizz")));
        copterObject.genericMethodHalfGenArgs(new Copter(897,"Not air"), "some text here");

        planeObject.genericMethodOneGenArg(new Plane(543, "Air"));
        System.out.println(planeObject.genericMethodTwoGenArgs(new Plane(765, "WizzAir"),
                new Plane(876, "New air")));
        planeObject.genericMethodHalfGenArgs(new Plane(909,"Last air"), "how many times");

        rocketObject.genericMethodOneGenArg(new Rocket(78723,"Wow rocket"));
        System.out.println(rocketObject.genericMethodTwoGenArgs(new Rocket(7634, "Nassa rocket"),
                new Rocket(6435, "Not nassa rocket")));
        rocketObject.genericMethodHalfGenArgs(new Rocket(6785,"new rocket"), "what if");

        carObject.genericMethodOneGenArg(new Car(67,"Mazeratti"));
        System.out.println(carObject.genericMethodTwoGenArgs(new Car(86, "Reno"), new Car(76, "Audi")));
        carObject.genericMethodHalfGenArgs(new Car(68,"BMW"), "lot of cars");

        mopedObject.genericMethodOneGenArg(new Moped(74,"Moped"));
        System.out.println(mopedObject.genericMethodTwoGenArgs(new Moped(76, "Suzuki"),
                new Moped(76, "Not suzuki")));
        mopedObject.genericMethodHalfGenArgs(new Moped(87, "BMW"), "don't know mopeds");

        motorbikeObject.genericMethodOneGenArg(new Motorbike(76, "Yamaha"));
        System.out.println(motorbikeObject.genericMethodTwoGenArgs(new Motorbike(87, "New bike"),
                new Motorbike(87, "New Motorbike")));
        motorbikeObject.genericMethodHalfGenArgs(new Motorbike(87,"The"), "motorbikes here");

        bottleObject.genericMethodOneGenArg(new Bottle(7.8,7, 5, new Plastic()));
        System.out.println(bottleObject.genericMethodTwoGenArgs(new Bottle(4.5,8, 45, new Glass()),
                new Bottle(6.7,8, 21, new Metal())));
        bottleObject.genericMethodHalfGenArgs(new Bottle(3.3,5, 43, new Glass()), "botlle");

        canObject.genericMethodOneGenArg(new Can(3, ""));
        System.out.println(canObject.genericMethodTwoGenArgs(new Can(2, ""), new Can(1, "")));
        canObject.genericMethodHalfGenArgs(new Can(4, ""),"can");

        mugObject.genericMethodOneGenArg(new Mug(2, ""));
        System.out.println(mugObject.genericMethodTwoGenArgs(new Mug(4, ""), new Mug(3, "")));
        mugObject.genericMethodHalfGenArgs(new Mug(3, ""), "mug");

        beetleObject.genericMethodOneGenArg(new Beetle(4,""));
        System.out.println(beetleObject.genericMethodTwoGenArgs(new Beetle(4,""),
                new Beetle(3,"")));
        beetleObject.genericMethodHalfGenArgs(new Beetle(5,""), "beetle");

        carrotObject.genericMethodOneGenArg(new Carrot());
        System.out.println(carrotObject.genericMethodTwoGenArgs(new Carrot(), new Carrot()));
        carrotObject.genericMethodHalfGenArgs(new Carrot(), "carrot");

        chamomileObject.genericMethodOneGenArg(new Chamomile());
        System.out.println(chamomileObject.genericMethodTwoGenArgs(new Chamomile(), new Chamomile()));
        chamomileObject.genericMethodHalfGenArgs(new Chamomile(),"chamomile");

        crocodileObject.genericMethodOneGenArg(new Crocodile(54,""));
        System.out.println(crocodileObject.genericMethodTwoGenArgs(new Crocodile(56,""),
                new Crocodile(46, "")));
        crocodileObject.genericMethodHalfGenArgs(new Crocodile(54,""), "");

        flyObject.genericMethodOneGenArg(new Fly(4,""));
        System.out.println(flyObject.genericMethodTwoGenArgs(new Fly(4,""),
                new Fly(5,"")));
        flyObject.genericMethodHalfGenArgs(new Fly(4,""), "fly");

        maylilyObject.genericMethodOneGenArg(new Maylily());
        System.out.println(maylilyObject.genericMethodTwoGenArgs(new Maylily(), new Maylily()));
        maylilyObject.genericMethodHalfGenArgs(new Maylily(), "maylily");

        mosquitoObject.genericMethodOneGenArg(new Mosquito(3,""));
        System.out.println(mosquitoObject.genericMethodTwoGenArgs(new Mosquito(2,""),
                new Mosquito(1, "")));
        mosquitoObject.genericMethodHalfGenArgs(new Mosquito(1,""), "mosquito");

        pigeonObject.genericMethodOneGenArg(new Pigeon(1,""));
        System.out.println(pigeonObject.genericMethodTwoGenArgs(new Pigeon(5,""),
                new Pigeon(6, "")));
        pigeonObject.genericMethodHalfGenArgs(new Pigeon(6,""), "pigeon");

        potatoObject.genericMethodOneGenArg(new Potato());
        System.out.println(potatoObject.genericMethodTwoGenArgs(new Potato(), new Potato()));
        potatoObject.genericMethodHalfGenArgs(new Potato(), "potato");

        radishObject.genericMethodOneGenArg(new Radish());
        System.out.println(radishObject.genericMethodTwoGenArgs(new Radish(), new Radish()));
        radishObject.genericMethodHalfGenArgs(new Radish(), "radish");

        ravenObject.genericMethodOneGenArg(new Raven(3,""));
        System.out.println(ravenObject.genericMethodTwoGenArgs(new Raven(3,""),
                new Raven(4, "")));
        ravenObject.genericMethodHalfGenArgs(new Raven(3, ""), "raven");

        roseObject.genericMethodOneGenArg(new Rose());
        System.out.println(roseObject.genericMethodTwoGenArgs(new Rose(), new Rose()));
        roseObject.genericMethodHalfGenArgs(new Rose(), "rose");

    }
}
