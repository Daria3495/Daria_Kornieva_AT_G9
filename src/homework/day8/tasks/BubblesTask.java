package homework.day8.tasks;

import homework.day8.my_objects.Bubble;
import homework.day8.tasks.utils.PrintUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubblesTask {

    List<Bubble> bubbleList = new ArrayList<>(Arrays.asList(
            new Bubble(2, "CO2"),
            new Bubble(4, "O2"),
            new Bubble(5, "CO")));

    public void printVolume() {
        for (Bubble bubble : bubbleList) {
            System.out.print(bubble.getVolume()+ " ");
        }
    }

    public void printName() {
        for (Bubble name : bubbleList) {
            System.out.print(name.getName()+ " ");
        }
    }

    public void countVolume() {
        int volumeSum = 0;

        for (Bubble bubble : bubbleList) {
            volumeSum += bubble.getVolume();
        }
        System.out.println("Sum of all bubble volumes is: " + volumeSum);
    }

    public static void main(String[] args) {
        BubblesTask bubblesTask = new BubblesTask();

        bubblesTask.printVolume();
        System.out.println();
        bubblesTask.printName();
        bubblesTask.countVolume();
        PrintUtil.printListByIndex(bubblesTask.bubbleList, "\n");
    }
}
