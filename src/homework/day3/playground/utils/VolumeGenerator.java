package homework.day3.playground.utils;

import homework.day3.playground.essence.material.Diesel;
import homework.day3.playground.essence.material.Petrol;
import homework.day3.playground.essence.material.Pourable;
import homework.day3.playground.essence.material.Water;

import java.util.Random;

public class VolumeGenerator {

    public static int generateVolume(Pourable pourable) {

        Petrol petrol = new Petrol();
        Diesel diesel = new Diesel();
        Water water = new Water();


        Random random = new Random();
        int randomNumber = random.nextInt(1,100);

        if (randomNumber >=1 && randomNumber< 50) {
            pourable = petrol;
            pourable = diesel;
        } else if (randomNumber >=50 && randomNumber< 100) {
            pourable = water;
        }
        System.out.printf("VolumeGenerator: I have generated volume of %s with value: %s", pourable, randomNumber);

        return randomNumber;
    }

}
