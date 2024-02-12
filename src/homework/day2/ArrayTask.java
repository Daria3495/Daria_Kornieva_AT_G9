package homework.day2;

public class ArrayTask {

    int[] array = new int[100];
    int sum;

    public void sumOfElements() {
        for (int i = 0; i <= array.length; i++) {
            int subtotal = sum + i;
            sum=subtotal;
        }
        System.out.println(sum);
    }

}
