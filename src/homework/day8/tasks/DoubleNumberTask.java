package homework.day8.tasks;

import homework.day8.tasks.utils.PrintUtil;

import java.util.Arrays;
import java.util.List;

public class DoubleNumberTask {

    List<Double> doubleNumbersList = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
    public void countAllNumbers() {
        double counter = 1;

        for (int i = 0; i < doubleNumbersList.size(); i++) {
            counter *= doubleNumbersList.get(i);
        }
        System.out.println("Multiplication of all elements: " + counter);
    }

    public void sumOfDecimalParts() {

        double result = 0;

        for (double decimalNumber : doubleNumbersList) {
            double decimal = decimalNumber % 1;
            result += decimal;
        }
        System.out.println("Sum for deci,al part of numbers in list: " + result);
    }

    public void printIntegerOfFraction() {
        for (int i = 0; i < doubleNumbersList.size(); i++) {
            double number = doubleNumbersList.get(i);
            int integerPart = (int) number;
            System.out.print(integerPart + " ");
        }
    }
    public static void main(String[] args) {

        DoubleNumberTask doubleNumberTask = new DoubleNumberTask();
        PrintUtil.printListWithForEach(doubleNumberTask.doubleNumbersList, " ");
        System.out.println();
        doubleNumberTask.countAllNumbers();
        PrintUtil.printListByIndex(doubleNumberTask.doubleNumbersList, " ");
        System.out.println();
        doubleNumberTask.sumOfDecimalParts();
        doubleNumberTask.printIntegerOfFraction();
    }
}
