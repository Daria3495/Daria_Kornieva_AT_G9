package homework.day1.pretask;

import static java.lang.Integer.sum;

public class SumExample {

    public static int a = 53;

    public static int b = 79;

//    public static int result = a+b;

    public static int countResult(int a, int b) {
        return sum(a, b);
    }

    public static void main(String[] args) {
        System.out.println(countResult(a, b));
//        int a = 2;
//        int b = 3;
//        int sum = a + b;
//        System.out.println(sum);
    }

}
