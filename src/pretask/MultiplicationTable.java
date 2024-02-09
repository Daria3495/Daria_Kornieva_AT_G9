package pretask;

public class MultiplicationTable {

    public static void main(String[] args) {

        int number = 5;

        for (int i = 1; i <=10; i++ ) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
