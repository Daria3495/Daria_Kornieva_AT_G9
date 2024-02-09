package pretask;

import static java.lang.Integer.sum;

public class MathOperatorsExample {

    public static int a = 3;
    public static int b = 9;

    public static int addition() {
        int sumResult = sum(a, b);
        return sumResult;
    }

    public static int subtraction() {
        int subtractionResult = a - b;
        return subtractionResult;
    }

    public static int multiplication() {
        int multiplicationResult = a * b;
        return multiplicationResult;
    }

    public static int division() {
        int divisionResult = a / b;
        return divisionResult;
    }

    public static void main(String[] args) {

        System.out.println("Result of addition of a and b is " + addition());
        System.out.println("Result of subtraction of a and b is " + subtraction());
        System.out.println("Result of multiplication of a and b is " + multiplication());
        System.out.println("Result of division of a and b is " + division());

    }
}
