package homework.day8.tasks;

import homework.day8.tasks.utils.PrintUtil;

import java.util.*;

public class IntNumberTask {

    List<Integer> intNumbersList = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

    public void countAllNumbers() {
        int counter = 0;

        for (int i = 0; i < intNumbersList.size(); i++) {
            counter += intNumbersList.get(i);
        }
        System.out.println("Sum of all elements: " + counter); //sum is 36027
    }

    public void sortInAscendingOrder() {
        Collections.sort(intNumbersList);
    }

    public void sortInDescendingOrder() {
        Collections.sort(intNumbersList, Collections.reverseOrder());
    }

    public static void main(String[] args) {
        IntNumberTask intNumberTask = new IntNumberTask();
        PrintUtil.printListWithForEach(intNumberTask.intNumbersList, "\n");
        intNumberTask.countAllNumbers();
        intNumberTask.sortInAscendingOrder();
        PrintUtil.printListByIndex(intNumberTask.intNumbersList, " ");
        System.out.println();
        intNumberTask.sortInDescendingOrder();
        PrintUtil.printListWithForEach(intNumberTask.intNumbersList, " ");
    }
}
