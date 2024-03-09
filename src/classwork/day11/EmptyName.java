package classwork.day11;

public class EmptyName {

    public static void main(String[] args) {
        new EmptyName();

    }

    {
        System.out.println("Нет имени");
        System.out.println("у блока");
        int test;
    }
    // принадлежит обьекту и не выполнится если нет обьекта

    static {
        System.out.println("Нет ");
        System.out.println(" bvtyb у блока");
        int test;
    }
    // нет имени и к этому блоку нельзя обратиться
    // принадлежит классу из за статика и можно вызвать без метода
    // можно сделать что-то в самом начале ( прекондишен)
}
