package homework.day11;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<Mouse> fillListWithMouses(int mouseNumber) {

    List<Mouse> mouseList = new ArrayList<>();

        for (int i = 1; i <= mouseNumber; i++) {
            mouseList.add(new Mouse(i));
            System.out.println("Mouse added");
        }
        return mouseList;
    }

    public static synchronized void removeMouse(List<Mouse> mouseList) {

        while (!mouseList.isEmpty()) {
            mouseList.iterator().next().peep();
            mouseList.remove(0);
            System.out.println(mouseList.size() +"Thread id = "+Thread.currentThread().threadId());
        }
    }

    public synchronized static void removeListElementsWithDelay(List<Mouse> mouseList) {

        mouseList.iterator().next().peep();
        mouseList.remove(0);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.getCause();
            }
        }
    // как сюда передать mouseList список - нам нужно потом его еще использовать
}
