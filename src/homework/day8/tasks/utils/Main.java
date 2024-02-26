package homework.day8.tasks.utils;

import homework.day8.my_objects.Bubble;

import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        List<Bubble> bubbles = List.of(new Bubble(1, "q"), new Bubble(2, "a"), new Bubble(3, "r"));
        print(bubbles, Bubble::getName);
        print(bubbles, Bubble::getVolume);
    }

    private static <T, E> void print(List<T> list, Function<T, E> supplier) {
        for (T obj: list) {
            System.out.println(supplier.apply(obj));
        }
    }
}
