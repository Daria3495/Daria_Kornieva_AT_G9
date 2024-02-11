package homework.day1.cycletask;

import java.util.Random;

public class RandomArray {

    int[] array = new int[7];
    Random random = new Random();

    public void assignRandom() {

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
            System.out.print(array[i] + " ");
        }
    }
//    public void showRandom() {
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//    }

    public void assignReverse() {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public void multiplyArray() {
        for (int i = 0; i < array.length; i++) {
            int newValue = array[i] * 5;
            System.out.print(newValue + " ");
        }
    }

    public void squaring() {
        for (int i = 0; i < array.length; i++) {
            int newValue = (int) Math.pow(array[i], 2);
            System.out.print(newValue + " ");
        }
    }

    public void findMinValue() {

        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.print(minValue + " ");
    }

    public void changePlace() {
        int firstValue = array[0];

        int lastValue = array[6];

        for (int i = 0; i < array.length; i++) {
            array[0] = lastValue;
            array[6] = firstValue;
            System.out.print(array[i] + " ");
        }
    }

    public void descSorting() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}
