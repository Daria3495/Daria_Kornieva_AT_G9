package classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        long m = list.stream().filter(s -> s.contains("м")).count();
        System.out.println(m);

        String firstObject = list.stream().findFirst().orElse("мама");
        System.out.println(firstObject);

        String second = list.stream().filter("мама"::contains).findFirst().get();
        System.out.println(second);

        String third = list.stream().skip(4).findFirst().get();
        System.out.println(third);

        List<String> forth = list.stream().skip(2).limit(2).collect(Collectors.toList());
        System.out.println(forth);

        List<String> fifth = list.stream().filter(s -> s.contains("м")).distinct().collect(Collectors.toList());
        System.out.println(fifth);
        
    }


}
