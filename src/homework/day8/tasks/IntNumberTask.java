package homework.day8.tasks;

import java.util.*;

public class IntNumberTask {

    List<Integer> intNumbersList = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

    public void printForEach() {
        for (int number : intNumbersList) {
            System.out.println(number);
        }
    }

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

    public void printWithIterator() {
        for (int i = 0; i < intNumbersList.size(); i++) {
            System.out.print(intNumbersList.get(i) + " ");
        }
    }

    public void sortInDescendingOrder() {
        Collections.sort(intNumbersList, Collections.reverseOrder());
    }

    public void printForEachWithSpace() {
        for (int number : intNumbersList) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        IntNumberTask intNumberTask = new IntNumberTask();
        intNumberTask.printForEach();
        intNumberTask.countAllNumbers();
        intNumberTask.sortInAscendingOrder();
        intNumberTask.printWithIterator();
        System.out.println();
        intNumberTask.sortInDescendingOrder();
        intNumberTask.printForEachWithSpace();
    }
}
