package homework.day11;

//- в главном потоке создать коллекцию из 280 мышей, далее создать 5 дочерних потоков (например, в цикле for),
// в каждом из которых удалять 1 пикающую мышь, пока коллекция не станет пустой

import java.util.ArrayList;
import java.util.List;

public class Task_3 {

    public static void main(String[] args) {

        List<Mouse> mouseList = Util.fillListWithMouses(280);

//        for (int i = 0; i < 5; i++) {
//            new Thread(() -> Util.removeMouse(mouseList)).start();
//        }
        // почему тут тред айди для всех одинаков

//        for (int j = 0; j < 5; j++) {
//            new Thread(() -> {
//                while (!mouseList.isEmpty()) {
//                    synchronized (mouseList.get(0)) {
//                        mouseList.iterator().next().peep();
//                        mouseList.remove(0);
//                        System.out.println(mouseList.size() + "Thread id " + Thread.currentThread().threadId());
//                    }
//                }
//            }).start();
//        }

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                synchronized (mouseList) {
                    for (int j = 0; j < mouseList.size(); j++) {
                        mouseList.iterator().next().peep();
                        mouseList.remove(0);
                        System.out.println(mouseList.size() + "Thread id " + Thread.currentThread().threadId());
                    }
                }
            }).start();
        }
    }
}
// как ограничить колличество потоков
