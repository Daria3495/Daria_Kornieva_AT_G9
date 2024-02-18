package homework.day6.generics;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T argument) {
        System.out.printf("I am an object of %s class\n", argument.getClass().getSimpleName());
    }

    public String genericMethodTwoGenArgs(T arg1, T arg2) {
        return "We are objects of " + arg1.getClass().getSimpleName() + " class and "
                + arg2.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(T arg3, String stringArg) {
        System.out.printf("I got an object of %s class and String with %s characters\n", arg3.getClass().getSimpleName(),
                stringArg.length());
    }

}
