package homework.day2;

public class ArrayRunner {

    public static void main(String[] args) {

        ArrayTask arrayTask = new ArrayTask();

        arrayTask.sumOfElements(new int[] {4,7,2,9,0,13,67,45,32,90,23}, 2);

        System.out.println("Array is sorted in reverse order  " );
        arrayTask.mirroringArrayCalculation(new int[]{5, 3, 2, 5, 87, 67,1},6);
        arrayTask.mirroringArrayDisplaying();
        arrayTask.drawDog();


    }

}
