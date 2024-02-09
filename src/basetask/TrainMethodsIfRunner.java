package basetask;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {

        TrainMethodsIf myRunner = new TrainMethodsIf();

        System.out.println("метод returnNewChar вернул " + myRunner.returnNewChar('y'));
        System.out.println("метод returnNewDouble вернул " + myRunner.returnNewDouble(31));
        System.out.println("метод returnNewFloat вернул " + myRunner.returnNewFloat(0.76f));
        System.out.println("метод returnNewInt вернул " + myRunner.returnNewInt(12));
        System.out.println("метод returnNewLong вернул " + myRunner.returnNewLong(30));
        myRunner.returnNewBoolean(false);
    }

}
