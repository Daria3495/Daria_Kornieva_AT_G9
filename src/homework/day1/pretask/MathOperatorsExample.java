package homework.day1.pretask;

import static java.lang.Integer.sum;

public class MathOperatorsExample {

    public int a = 3;
    public int b = 9;

    public int addition() {
        int sumResult = sum(a, b);
        return sumResult;
    }

    public int subtraction() {
        int subtractionResult = a - b;
        return subtractionResult;
    }

    public int multiplication() {
        int multiplicationResult = a * b;
        return multiplicationResult;
    }

    public int division() {
        int divisionResult = a / b;
        return divisionResult;
    }

    public static void main(String[] args) {

        MathOperatorsExample mathOperatorsExample = new MathOperatorsExample();

        System.out.println("Result of addition of a and b is " + mathOperatorsExample.addition());
        System.out.println("Result of subtraction of a and b is " + mathOperatorsExample.subtraction());
        System.out.println("Result of multiplication of a and b is " + mathOperatorsExample.multiplication());
        System.out.println("Result of division of a and b is " + mathOperatorsExample.division());

    }
}
