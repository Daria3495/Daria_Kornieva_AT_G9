package homework.day2;

import java.util.Arrays;

public class ArrayTask {
    int[] array = new int[10];
    int[] resultArray = new int[array.length];
    int sum;
    int count;
    int n = 3;
    int temp = 0;

    public void sumOfElements(int [] array, int n) {
        for (int i = n-1; i < array.length; i+=n) {
            sum = sum + array[i];
        }
        System.out.println("Sum of elements in array = " + sum);
    }

    public int[] mirroringArrayCalculation(int[] array, int n) {

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

    public void drawDog () {
        System.out.println("	  ^__^");
        System.out.println("\t  (oo)\\\\_______");
        System.out.println("\t (__)\\)\\/\\ \\");
        System.out.println("\t      ||----w|\\");
        System.out.println("\t      ||   ||");
    }

}
