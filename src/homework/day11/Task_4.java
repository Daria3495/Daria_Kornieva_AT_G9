package homework.day11;

//- в главном потоке создать коллекцию из 380 мышей, далее создать 7 дочерних потоков (например, в цикле for),
// в каждом из которых каджые 250мс удалять 1 пикающую мышь, пока коллекция не станет пустой

import java.util.List;

public class Task_4 {

    public static void main(String[] args) {

        List<Mouse> mouseList = Util.fillListWithMouses(380);

        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                Util.removeListElementsWithDelay(mouseList);
//                SleepUtil.sleep(3000);  //когда все в одном метоже - работает, если вызывать отдельно - не работает
            }).start();
        }
    }


}
