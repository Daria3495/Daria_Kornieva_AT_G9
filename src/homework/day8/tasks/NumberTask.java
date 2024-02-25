package homework.day8.tasks;

import java.util.*;

public class NumberTask {

    List<Double> numbersList = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

    public void printForEach() {
        for (double number : numbersList) {
            System.out.println(number);
        }
    }

    public void countAllNumbers() {
        double counter = 0;

        for (int i = 0; i < numbersList.size(); i++) {
            counter += numbersList.get(i);
        }
        System.out.println("Sum of all elements: " + counter);
    }

    public void sortInAscendingOrder() {
        Collections.sort(numbersList);
    }

    public void printWithIterator() {
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(numbersList.get(i) + " ");
        }
    }

    public void sortInDescendingOrder() {
        Collections.sort(numbersList, Collections.reverseOrder());
    }

    public void printForEachWithSpace() {
        for (double number : numbersList) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        NumberTask numberTask = new NumberTask();
        numberTask.printForEach();
        numberTask.countAllNumbers();
        numberTask.sortInAscendingOrder();
        numberTask.printWithIterator();
        System.out.println();
        numberTask.sortInDescendingOrder();
        numberTask.printForEachWithSpace();
    }
}
