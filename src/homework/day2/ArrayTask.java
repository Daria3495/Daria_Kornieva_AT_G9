package homework.day2;

import java.util.Arrays;

public class ArrayTask {

    int[] array = new int[10];

    int[] resultArray = new int[array.length];
    int sum;
    int count;
    int n = 3;
    int temp = 0;

    public void sumOfElements() {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            int subtotal = sum + i;
            sum = subtotal;
        }
        System.out.println("Initial array = " + Arrays.toString(array));
        System.out.println("Sum of elements in array = " + sum);
    }

    public int[] mirroringArrayCalculation() {

        for (int variable : array) {
            if (variable > n && variable != 0) {
                count++;
            }
            int[] newResultArray = new int[count];
            resultArray = newResultArray;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                resultArray[temp] = array[i];
                temp++;
            }
        }

        int[] reversedArray = new int[resultArray.length];
        for (int i = resultArray.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = resultArray[i];
        }
        resultArray = reversedArray;

        return resultArray;
    }

    public void mirroringArrayDisplaying() {
        System.out.println(Arrays.toString(resultArray));
    }

}
