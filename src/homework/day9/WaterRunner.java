package homework.day9;

import homework.day8.my_objects.Water;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {

    public static void main(String[] args) {

        Stream<Water> water = Stream.of(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"),
                new Water("Синяя", "Мятный"));

        System.out.println(water  // можно ли как то без sout реализовать?
                .filter(waterObject -> waterObject.getColor() != "Прозрачная")
                .sorted(Comparator.comparing(Water::getSmell).reversed())
                .map(waterObject -> waterObject.getSmell().contains("ы") ?
                        waterObject.getSmell().replace("ы", "ыы") : waterObject.getSmell())
                .collect(Collectors.joining())
                .length());
    }

}
