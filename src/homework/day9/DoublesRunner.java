package homework.day9;

import homework.day8.my_objects.Bubble;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoublesRunner {

    public static void main(String[] args) {
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        doubles
                .map(Math::round)
                .map(s -> new Random().nextInt(0, (int) (s+1)))
                .distinct()
                .flatMap(s -> IntStream.range(0,s)
                        .mapToObj(d -> new Bubble(
                                s, "Bubble vol-" + s)))
                .forEach(System.out::println);
    }

}
