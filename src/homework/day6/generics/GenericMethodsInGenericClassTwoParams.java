package homework.day6.generics;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public String genericMethodGenArgs(X arg1, Y arg2) {
        return "I received " + genericMethodGenArgs(arg1, arg2).length() + " arguments of type: " +
                arg1.getClass().getSimpleName() + " class, Y " + arg2.getClass().getSimpleName() + " class";
    }


}
