package homework.day8.tasks;

import homework.day8.my_objects.Sand;
import homework.day8.tasks.utils.PrintUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandTask {

    List<Sand> sandList = new ArrayList<>();

    Map<Integer, Sand> sandMap = new HashMap<>();

    public void addObject() {
        sandList.add(new Sand(2, "Речной"));
        sandList.add(new Sand(4, "Речной"));
        sandList.add(new Sand(2, "Карьерный"));
        sandList.add(new Sand(7, "Речной"));
    }

    public void printWeightViaForEach() {
        for (Sand sand : sandList) {
            System.out.print(sand.getWeight() + " ");
        }
    }

    public void printNameViaForEach() {
        for (Sand sand : sandList) {
            System.out.print(sand.getName() + " ");
        }
    }

    public void addObjectToMap() {

        int keyValue = 32;
        for (Sand sand : sandList) {
            sandMap.put(keyValue, sand);
            keyValue++;
        }
    }

    public static void main(String[] args) {
        SandTask sandTask = new SandTask();

        sandTask.addObject();
        sandTask.printWeightViaForEach();
        System.out.println();
        sandTask.printNameViaForEach();
        System.out.println();
        sandTask.addObjectToMap();
        System.out.println("Key values: ");
        PrintUtil.printMapKey(sandTask.sandMap, " ");
        System.out.println();
        System.out.println("Values in Map: ");
        PrintUtil.printMapValue(sandTask.sandMap, "\n");
        System.out.println("Map values: ");
        PrintUtil.printMap(sandTask.sandMap);
    }

}
