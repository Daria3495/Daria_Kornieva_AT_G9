package homework.day9;

import homework.day8.my_objects.Bubble;
import homework.day8.my_objects.Chair;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class FurnitureRunner {

    public static void main(String[] args) {
        Stream<Chair> furniture = Stream.of(
                new Chair(120, 40),
                new Chair(90, 30),
                new Chair(100, 50),
                new Chair(110, 45));

        furniture
                .filter(chair -> chair.getWidth() >= 100 && chair.getHeight() <= 50)
                .sorted(Comparator.comparing(Chair::getHeight).thenComparing(Chair::getWidth))
                .map(chair -> new Chair(chair.getWidth() / 2, chair.getHeight() * new Random().nextInt(3, 9)))
                .map(chair -> chair.getHeight() * chair.getWidth())
                .max(Integer::compareTo).stream().toList()
                .stream().map(number -> {
                            String bubbleName = null;
                            switch (number) {
                                case 0:
                                    bubbleName = "ноль ";
                                    break;
                                case 1:
                                    bubbleName = "один ";
                                    break;
                                case 2:
                                    bubbleName = "два ";
                                    break;
                                case 3:
                                    bubbleName = "три ";
                                    break;
                                case 4:
                                    bubbleName = "четыре ";
                                    break;
                                case 5:
                                    bubbleName = "пять ";
                                    break;
                                case 6:
                                    bubbleName = "шесть ";
                                    break;
                                case 7:
                                    bubbleName = "семь ";
                                    break;
                                case 8:
                                    bubbleName = "восемь ";
                                    break;
                                case 9:
                                    bubbleName = "девять ";
                            }
                            return new Bubble(number, bubbleName);
                        }
                )
                .forEach(System.out::println);
    }

}
