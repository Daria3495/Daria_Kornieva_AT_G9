package homework.day8.tasks;

import java.util.Arrays;
import java.util.List;

public class DoubleNumberTask {

    List<Double> doubleNumbersList = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

    public void printForEachWithSpace() {
        for (double number : doubleNumbersList) {
            System.out.print(number + " ");
        }
    }

    public void countAllNumbers() {
        double counter = 0;

        for (int i = 0; i < doubleNumbersList.size(); i++) {
            counter += doubleNumbersList.get(i);
        }
        System.out.println("Sum of all elements: " + counter); // sum 866.2926
    }

    public void sumOfDecimalParts() {

        double result = 0;

        for (double decimalNumber : doubleNumbersList) {
            double decimal = decimalNumber % 1;
            result += decimal;
        }
        System.out.println("Sum for deci,al part of numbers in list: " + result);
    }

    public void printWithIterator() {
        for (int i = 0; i < doubleNumbersList.size(); i++) {
            System.out.print(doubleNumbersList.get(i) + " ");
        }
    }

    public static void main(String[] args) {

        DoubleNumberTask doubleNumberTask = new DoubleNumberTask();
//        doubleNumberTask.printForEachWithSpace();
//        System.out.println();
//        doubleNumberTask.countAllNumbers();
//        doubleNumberTask.printWithIterator();
        doubleNumberTask.sumOfDecimalParts();
    }
}
