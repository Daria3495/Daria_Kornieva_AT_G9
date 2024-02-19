package homework.day6.generics;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public String genericMethodGenArgs(X arg1, Y arg2) {
        return "I received " + 2 + " arguments of type: " +
                arg1.getClass().getSimpleName() + " class, and " + arg2.getClass().getSimpleName() + " class";
    }

    public String genericMethodGenArgs(X... args) {
        return "I received " + args.length + " arguments of type: " +
                args.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(X halfArg1, Y halfArg2, String stringArg) {
        System.out.printf("I got an object of %s class and %s class and string with %s characters\n",
                halfArg1.getClass().getSimpleName(), halfArg2.getClass().getSimpleName(), stringArg.length());
    }

    public void genericMethodHalfGenArgs(Y halfArg1, String stringArg) {
        System.out.printf("I got an object of %s class and string with %s characters\n",
                halfArg1.getClass().getSimpleName(), stringArg.length());
    }

//    public void genericMethodHalfGenArgs(X halfArg2, String stringArg) {
//        System.out.printf("I got an object of %s class and %s class and string with N characters",
//                halfArg2.getClass().getSimpleName(), stringArg.length());
//    }

}
