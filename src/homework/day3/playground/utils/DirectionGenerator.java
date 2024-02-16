package homework.day3.playground.utils;

import java.util.Random;

public class DirectionGenerator {

    public static String generateDirection() {

        String direction = null;

        Random random = new Random();

        int randomNumber = random.nextInt(1, 40);

        if (randomNumber >= 1 && randomNumber <= 9) {
            direction = "NORTH";
        } else if (randomNumber >= 10 && randomNumber <= 19) {
            direction = "SOUTH";
        } else if (randomNumber >= 20 && randomNumber <= 29) {
            direction = "WEST";
        } else if (randomNumber >= 30 && randomNumber <= 39) {
            direction = "EAST";
        }
        return direction;
    }

//    public static void main(String[] args) {
//        DirectionGenerator directionGenerator = new DirectionGenerator();
//
//        System.out.println(directionGenerator.generateDirection());
//    }
}
