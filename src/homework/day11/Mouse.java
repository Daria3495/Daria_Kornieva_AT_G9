package homework.day11;

public class Mouse {

    private String pattern = "Mouse <n>";
    private String name;
    private int number;

    public Mouse(int number) {
        this.name = pattern.replace("<n>", String.valueOf(number));
    }

    public int getNumber() {
        return number;
    }

    public void peep() {
        System.out.printf("%s PEEP!", name);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//        Mouse mouse = new Mouse(1);
//
//        mouse.peep();
//    }

}


//private String pattern - содержит паттерн имени мыши формате "Mouse <n>", где n - порядковый номер мыши
//private String name - имя мыши в формате "Mouse <n>", где n - порядковый номер мыши
//конструктор public Mouse(int number) - в нем инициализируется поле name
//метод public void peep() - печатает в консоль фразу в формате "Mouse <n> PEEP!", где n - порядковый номер мыши, и заставляет поток заснуть на 200мс