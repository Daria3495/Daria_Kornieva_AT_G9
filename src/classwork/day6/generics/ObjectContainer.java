package classwork.day6.generics;

public class ObjectContainer {

    private Object[] container = new Object[10];
    private int currentPosition;

    public void add(Object incoming) {
        if (currentPosition < container.length) {
            container[currentPosition++] = incoming;
        }
    }

    public Object removeLast() {
        Object result = null;
        if (currentPosition > 0) {
            result = container[currentPosition - 1];
            container[--currentPosition] = null;
        }
        return result;
    }

    public boolean isEmpty() {
        return currentPosition == 0;
    }

}
