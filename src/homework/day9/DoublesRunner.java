package homework.day9;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoublesRunner {

    public static void main(String[] args) {
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

//        doubles
//                .map(Math::round)
//                .map(s -> new Random().ints(0, (int) (s+1)).boxed())
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
    }

}
