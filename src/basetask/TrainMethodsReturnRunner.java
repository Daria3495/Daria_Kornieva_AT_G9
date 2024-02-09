package basetask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {

        TrainMethodsReturn returnObject = new TrainMethodsReturn();

        System.out.println("метод returnNewChar вернул " + returnObject.returnNewChar('*'));
        System.out.println("метод returnNewBoolean вернул " + returnObject.returnNewBoolean(true));
        System.out.println("метод returnNewByte вернул " + returnObject.returnNewByte((byte) 5));
        System.out.println("метод returnNewDouble вернул " + returnObject.returnNewDouble(67483234.243));
        System.out.println("метод returnNewFloat вернул " + returnObject.returnNewFloat(34526.457f));
        System.out.println("метод returnNewLong вернул " + returnObject.returnNewLong(123457780));
        System.out.println("метод returnNewShort вернул " + returnObject.returnNewShort((short) 123));
        System.out.println("метод runNewInt вернул " + returnObject.runNewInt(467));

    }
}
