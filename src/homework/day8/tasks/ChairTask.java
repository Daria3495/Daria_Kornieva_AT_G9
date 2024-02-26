package homework.day8.tasks;

import homework.day8.my_objects.Chair;
import homework.day8.tasks.utils.PrintUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChairTask {

    List<Chair> chairList = Arrays.asList(new Chair(1, 2),
            new Chair(4, 2),
            new Chair(2, 4));
    Map<Integer, Chair> chairMap = new HashMap<>();

    public void calculateProductOfHeightAndWidth() {

        for (Chair chair : chairList) {
            int result = chair.getHeight() * chair.getWidth();
            System.out.print(result + " ");
        }
    }

    public void addObjectToMap() {

        int keyValue = 43;

        for(Chair chair: chairList) {
            chairMap.put(keyValue, chair);
            keyValue++;
        }
    }

    public static void main(String[] args) {
        ChairTask chairTask = new ChairTask();

        System.out.println("Произведение высоты на ширину: ");
        chairTask.calculateProductOfHeightAndWidth();
        chairTask.addObjectToMap();
        System.out.println();
        System.out.println("Print Map keys: ");
        PrintUtil.printMapKey(chairTask.chairMap, " ");
        System.out.println();
        System.out.println("Print Map values: ");
        PrintUtil.printMapValue(chairTask.chairMap, "\n");
        PrintUtil.printMap(chairTask.chairMap);
    }

}
