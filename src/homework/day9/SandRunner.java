package homework.day9;

import homework.day8.my_objects.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class SandRunner {

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

//        Map <Integer, String> newSand = new HashMap<>();

        sandbox.add(new Sand(12, "Речной"));
        sandbox.add(new Sand(8, "Речной"));
        sandbox.add(new Sand(15, "Карьерный"));
        sandbox.add(new Sand(7, "Карьерный"));
        sandbox.add(new Sand(11, "Речной"));

        Map<Integer, String> sandboxMap = sandbox
                .stream().filter(sand -> sand.getWeight() > 9 && sand.getName().contains("ч"))
                .sorted(Comparator.comparing(Sand::getWeight))
                .map(sand -> new Sand(sand.getWeight() * 2, sand.getName().toUpperCase(Locale.ROOT)))
                .collect(Collectors.toMap(Sand::getWeight, Sand::getName));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sandResult"))) {
            for (Map.Entry<Integer, String> sand : sandboxMap.entrySet()) {
                writer.write(sand.getKey() + ":" + sand.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Создать пустой список песка (класса Sand) sandbox (через new ArrayList)
    //Заполнить 5 объектами песка с весом (12, 8, 15, 7, 11) и именами (Речной, Речной, Карьерный, Карьерный, Речной) соответственно
    //Отфильтровать только тот песок, который весит больше 9 и имя которого содержит букву "ч"
    //Отсортировать по весу в восходящем порядке
    //На основании существующего потока данных создать новый, в котором каждый новый Sand имеет вес умноженный на 2, и имя в верхнем регистре
    //На основании получившегося потока данных создать коллекцию Map, где ключ - это вес, а значение - имя
    //Отпечатать каждый из элементов карты в виде value:key в текстовый файл
}
