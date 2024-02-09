package basetask;

public class TrainMethodsReturn {

    public int runNewInt(int intNumber) {
        int newIntNumber = intNumber * 3;
        return newIntNumber;
    }

    public long returnNewLong(long longNumber) {
        long newLongNumber = longNumber - 4;
        return newLongNumber;
    }

    public String  returnNewChar(char charCharacter) {
        String newStringFromChar = String.valueOf(charCharacter) + charCharacter;
        return newStringFromChar;
    }

    public float returnNewFloat(float floatNumber) {
        float newFloatNumber = floatNumber/2;
        return newFloatNumber;
    }

    public double returnNewDouble(double doubleNumber) {
        double newDoubleNumber = doubleNumber +8;
        return newDoubleNumber;
    }

    public short returnNewShort(short shortNumber) {
        short newShortNumber = (short) (shortNumber - 1);
        return  newShortNumber;
    }

    public byte returnNewByte(byte byteNumber) {
        byte newByteNumber = (byte) (byteNumber * 2);
        return newByteNumber;
    }

    public boolean returnNewBoolean(boolean booleanNumber) {
        boolean newBooleanNumber = booleanNumber;
        return newBooleanNumber;
    }
}
