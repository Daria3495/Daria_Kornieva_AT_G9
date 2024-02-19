package homework.day3.playground.utils;

import java.util.Random;

public class DistanceGenerator {

    public static int generateDistance() {

        Random random = new Random();
        int randomNumber = random.nextInt(1, 100);

        System.out.printf("DistanceGenerator: I have generated distance with value: %s\n", randomNumber);

        return randomNumber;
    }

}
