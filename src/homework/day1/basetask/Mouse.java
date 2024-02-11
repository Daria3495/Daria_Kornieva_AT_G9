package homework.day1.basetask;

public class Mouse {

    private String name;
    private int age;

    public Mouse (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void printMouseDetails (String name, int age) {

        System.out.println("Я мышь, меня зовут " + name + " и мой возраст " + age + " лет");
    }

    public static void main(String[] args) {
        Mouse.printMouseDetails("Vasta",14);
    }
}
