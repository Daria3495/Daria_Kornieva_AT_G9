package homework.day3.playground.utils;

import homework.day3.playground.essence.material.Diesel;
import homework.day3.playground.essence.material.Petrol;
import homework.day3.playground.essence.material.Pourable;
import homework.day3.playground.essence.material.Water;

import java.util.Random;

public class VolumeGenerator {

    public static int generateVolume(Pourable pourable) {

        Random random = new Random();
        int randomNumber = 0;

        if (pourable instanceof Petrol || pourable instanceof Diesel) {
            randomNumber = random.nextInt(1, 50);
        } else if (pourable instanceof Water) {
            randomNumber = random.nextInt(50, 100);
        }

        System.out.printf("VolumeGenerator: I have generated volume of %s with value: %s\n",
                pourable.getClass().getSimpleName(), randomNumber);

        return randomNumber;
    }

}
