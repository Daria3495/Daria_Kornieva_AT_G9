package homework.day6.generics;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T argument) {
        System.out.printf("I am an object of %s class\n", argument.getClass().getSimpleName());
    }

    public String genericMethodTwoGenArgs(T arg1, T arg2) {
        String result = "We are objects of %s class and $s class";
        return result;
    }

    public void genericMethodHalfGenArgs(T arg3, String stringArg) {
        System.out.printf("I got an object of %s %s and String with %s characters\n", arg3.getClass().getSimpleName(),
                stringArg.getClass().getSimpleName(), stringArg.length());
    }

}
