package homework.day9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);

        numbersMod
                .filter(s -> s.toString().contains("3"))
                .flatMap(s -> Arrays.stream(s.toString().split("")))
                .map(number -> {
                    switch (number) {
                        case "0":
                            return "ноль";
                        case "1":
                            return "один";
                        case "2":
                            return "два";
                        case "3":
                            return "три";
                        case "4":
                            return "четыре";
                        case "5":
                            return "пять";
                        case "6":
                            return "шесть";
                        case "7":
                            return "семь";
                        case "8":
                            return "восемь";
                        case "9":
                            return "девять";
                        default:
                            return number;
                    }
                })
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


    }
}
//Создать поток данных целых чисел numbersMod из 8 чисел (626, 435, 9, 1463268, 24, 2237, 33, 9090) через (Stream.of())
//Отфильтровать те числа, которые содержать цифру 3
//Разбить числа на отдельные цифры и заменить цифры соответствующими словами
//Оставить только уникальные слова, отсортировать в нисходящем порядке и отпечатать в консоль с новой строки