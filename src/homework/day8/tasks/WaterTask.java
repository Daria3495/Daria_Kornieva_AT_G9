package homework.day8.tasks;
import homework.day8.my_objects.Water;
import homework.day8.tasks.utils.PrintUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaterTask {

    List<Water> waterList = Arrays.asList(new Water("Прозрачная", "Нет"),
            new Water("Прозрачная","Нет"),
            new Water("Мутная","Аммиачный"));

    public void printWaterColor() {
        for(Water water : waterList) {
            System.out.println(water.getColor() + "-вода");
        }
    }


    public static void main(String[] args) {

        WaterTask waterTask = new WaterTask();

        waterTask.printWaterColor();

    }
}
