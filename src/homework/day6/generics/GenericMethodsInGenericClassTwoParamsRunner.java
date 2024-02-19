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

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassTwoParams<String, String> stringStringObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> stringIntegerObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> stringDoubleObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> integerIntegerObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Copter, Plane> copterPlaneObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rocket, Car> rocketCarObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Moped, Motorbike> mopedMotorbikeObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Bottle, Can> bottleCanObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mug, Beetle> mugBeetleObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Carrot, Chamomile> carrotChamomileObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Fly> crocodileFlyObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Maylily, Mosquito> maylilyMosquitoObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Pigeon, Potato> pigeonPotatoObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Radish, Raven> radishRavenObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rose, String> roseStringObject = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(stringStringObject.genericMethodGenArgs("some", "text"));
        System.out.println(stringStringObject.genericMethodGenArgs("test"));
        stringStringObject.genericMethodHalfGenArgs("test", "test");
        stringStringObject.genericMethodHalfGenArgs("tet", "tets", "te");

        System.out.println(stringIntegerObject.genericMethodGenArgs("test", 4));
        System.out.println(stringIntegerObject.genericMethodGenArgs(String.valueOf(6)));
        stringIntegerObject.genericMethodHalfGenArgs(90, "");
        stringIntegerObject.genericMethodHalfGenArgs("text", 888,"arg");

        System.out.println(stringDoubleObject.genericMethodGenArgs("text", 76.9));
        System.out.println(stringDoubleObject.genericMethodGenArgs(String.valueOf(98.8)));
        stringDoubleObject.genericMethodHalfGenArgs(65.8, "here some text");
        stringDoubleObject.genericMethodHalfGenArgs("text here", 75.9, "new text");

        System.out.println(integerIntegerObject.genericMethodGenArgs(4,7));
        System.out.println(integerIntegerObject.genericMethodGenArgs(9));
        integerIntegerObject.genericMethodHalfGenArgs(75,"seventy five");
        integerIntegerObject.genericMethodHalfGenArgs(7,83,"seven");

        System.out.println(copterPlaneObject.genericMethodGenArgs(new Copter(525,""),
                new Plane(634, "")));
        System.out.println(copterPlaneObject.genericMethodGenArgs(new Copter(765,"")));
        copterPlaneObject.genericMethodHalfGenArgs(new Plane(466,""), "Plane text");
        copterPlaneObject.genericMethodHalfGenArgs(new Copter(436, ""),
                new Plane(876, ""), "Copter text");

        System.out.println(rocketCarObject.genericMethodGenArgs(new Rocket(7564,"Rocket"),
                new Car(654, "Car")));
        System.out.println(rocketCarObject.genericMethodGenArgs(new Rocket(635,"Rocket")));
        rocketCarObject.genericMethodHalfGenArgs(new Car(64,""), "Car");
        rocketCarObject.genericMethodHalfGenArgs(new Rocket(534,"Rocket"),
                new Car(64, "BMW"), "bmw car");

        System.out.println(mopedMotorbikeObject.genericMethodGenArgs(new Moped(54,""),
                new Motorbike(78, "")));
        System.out.println(mopedMotorbikeObject.genericMethodGenArgs(new Moped(76,"")));
        mopedMotorbikeObject.genericMethodHalfGenArgs(new Moped(65,""),
                new Motorbike(75, ""), "Motorbike");
        mopedMotorbikeObject.genericMethodHalfGenArgs(new Motorbike(54, ""), "text");

        System.out.println(bottleCanObject.genericMethodGenArgs(new Bottle(65.98, 65), new Can()));
        System.out.println(bottleCanObject.genericMethodGenArgs(new Bottle(76.98, 6)));
        bottleCanObject.genericMethodHalfGenArgs(new Can(), "can");
        bottleCanObject.genericMethodHalfGenArgs(new Bottle(65.98, 6), new Can(), "");

        System.out.println(mugBeetleObject.genericMethodGenArgs(new Mug()));
        System.out.println(mugBeetleObject.genericMethodGenArgs(new Mug(), new Beetle(5,"")));
        mugBeetleObject.genericMethodHalfGenArgs(new Beetle(4, ""), "text");
        mugBeetleObject.genericMethodHalfGenArgs(new Mug(), new Beetle(7,""), "here text");

        System.out.println(carrotChamomileObject.genericMethodGenArgs(new Carrot(), new Chamomile()));
        System.out.println(carrotChamomileObject.genericMethodGenArgs(new Carrot()));
        carrotChamomileObject.genericMethodHalfGenArgs(new Chamomile(), "chamomile");
        carrotChamomileObject.genericMethodHalfGenArgs(new Carrot(), new Chamomile(), "");

        System.out.println(crocodileFlyObject.genericMethodGenArgs(new Crocodile(65, ""),
                new Fly(4,"")));
        System.out.println(crocodileFlyObject.genericMethodGenArgs(new Crocodile(65,"")));
        crocodileFlyObject.genericMethodHalfGenArgs(new Crocodile(64, ""),
                new Fly(7, ""), "crocodile");
        crocodileFlyObject.genericMethodHalfGenArgs(new Fly(4,""), "fly");

        System.out.println(maylilyMosquitoObject.genericMethodGenArgs(new Maylily(), new Mosquito(7, "")));
        System.out.println(maylilyMosquitoObject.genericMethodGenArgs(new Maylily()));
        maylilyMosquitoObject.genericMethodHalfGenArgs(new Mosquito(4, ""), "mosquito");
        maylilyMosquitoObject.genericMethodHalfGenArgs(new Maylily(),
                new Mosquito(4, ""), "maylily");

        System.out.println(pigeonPotatoObject.genericMethodGenArgs(new Pigeon(3,""), new Potato()));
        System.out.println(pigeonPotatoObject.genericMethodGenArgs(new Pigeon(4,"")));
        pigeonPotatoObject.genericMethodHalfGenArgs(new Potato(), "potato");
        pigeonPotatoObject.genericMethodHalfGenArgs(new Pigeon(3,""), new Potato(), "the pigeon");

        System.out.println(radishRavenObject.genericMethodGenArgs(new Radish(), new Raven(4, "")));
        System.out.println(radishRavenObject.genericMethodGenArgs(new Radish()));
        radishRavenObject.genericMethodHalfGenArgs(new Raven(4,""), "raven");
        radishRavenObject.genericMethodHalfGenArgs(new Radish(), new Raven(4,""), "radish");

        System.out.println(roseStringObject.genericMethodGenArgs(new Rose(), "e"));
        System.out.println(roseStringObject.genericMethodGenArgs(new Rose()));
        roseStringObject.genericMethodHalfGenArgs("string", "new string");
        roseStringObject.genericMethodHalfGenArgs(new Rose(), "rose", "new rose");

    }
}
