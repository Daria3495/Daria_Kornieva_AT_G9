package homework.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {

    public static void main(String[] args) {

        List <String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        System.out.println(birds.stream().map(s -> s.replace("о", "а"))
                .collect(Collectors.joining("")).toLowerCase()
                .replace("ь", "").replace("б", "б--\n"));
    }
}
