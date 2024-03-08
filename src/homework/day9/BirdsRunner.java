package homework.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirdsRunner {

    public static void main(String[] args) {

        List <String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        Stream.of(birds.stream().map(s -> s.replace("о", "а"))
                .collect(Collectors.joining("")).toLowerCase()
                .replace("ь", "").split("б")).forEach(s -> System.out.printf("--%s--\r\n",s));
                ;
    }
}

//Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
//Создать из списка поток данных, заменить в каждую букву "о" на букву "а"
//Собрать все слова в одну строку в ниждем регистре
//Убрать все символы мягкого знака
//Разбить на новые строки по букве "б"
//Отпечатать в консоль с новой строки в виде --Чайка--