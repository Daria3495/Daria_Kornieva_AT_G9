package homework.day9;

import homework.day8.my_objects.Bubble;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BubblesRunner {

    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

        System.out.println(bubbles
                .stream().filter(s -> s.getVolume() > 3)
                .sorted(Comparator.comparing(Bubble::getName)) //(s1, s2) -> s1.getName().compareTo(s2.getName())
                .map(s -> new Bubble(s.getVolume() * 3, s.getName()))
                .peek(System.out::println)
                .mapToInt(s -> s.getVolume()).sum());
    }
}
