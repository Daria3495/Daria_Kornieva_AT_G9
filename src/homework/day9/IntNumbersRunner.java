package homework.day9;

import java.util.Comparator;
import java.util.stream.Stream;

public class IntNumbersRunner {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        numbers
                .peek(System.out::println)
                .sorted(Integer::compareTo)
                .peek(System.out::println)
                .reduce((s1, s2) -> s1+s2)
                .stream()
                .forEach(System.out::println);

    }
}


//Создать поток данных целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Stream.of())
//В потоке данных проитерировать числа и отпечатать числа в консоль новой строки
//Отсортировать и снова отпечатать в консоль с новой строки
//Посчитать сумму всех чисел и вывести результат в консоль