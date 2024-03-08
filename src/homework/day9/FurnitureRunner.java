package homework.day9;

import homework.day8.my_objects.Bubble;
import homework.day8.my_objects.Chair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class FurnitureRunner {

    public static void main(String[] args) {
        Stream<Chair> furniture = Stream.of(
                new Chair(120, 40),
                new Chair(90, 30),
                new Chair(100, 50),
                new Chair(110, 45));

        Optional<Object> bubble = furniture
                .filter(chair -> chair.getWidth() >= 100 && chair.getHeight() <= 50)
                .sorted(Comparator.comparing(Chair::getHeight).thenComparing(Chair::getWidth))
                .map(chair -> new Chair(chair.getWidth() / 2, chair.getHeight() * new Random().nextInt(3, 9)))
                .map(chair -> chair.getHeight() * chair.getWidth())
                .max(Integer::compareTo)
                .map(number -> {
                    char[] charArray = Integer.toString(number).toCharArray();
                    StringBuilder bubbleName = new StringBuilder();

                    for (char ch : charArray) {
                        switch (ch) {
                            case '0' -> bubbleName.append("ноль ");
                            case '1' -> bubbleName.append("один ");
                            case '2' -> bubbleName.append("два ");
                            case '3' -> bubbleName.append("три ");
                            case '4' -> bubbleName.append("четыре ");
                            case '5' -> bubbleName.append("пять ");
                            case '6' -> bubbleName.append("шесть ");
                            case '7' -> bubbleName.append("семь ");
                            case '8' -> bubbleName.append("восемь ");
                            case '9' -> bubbleName.append("девять ");
                            default -> bubbleName.append(" ");
                        }
                    }
                    return new Bubble(number, bubbleName.toString());
                });

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("bubbleTask"))) {
            writer.write(String.valueOf(bubble));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
