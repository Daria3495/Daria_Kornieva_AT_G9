package homework.day11;


//- создать 7 одновременно запускающихся потоков (например, в цикле for),
// в каждом из которых, проитерировать коллекцию из 18 мышей, где каждая четная пикает

import java.util.ArrayList;
import java.util.List;

public class Task_2 {

    public static void main(String[] args) {

        List<Mouse> mouseList = Util.fillListWithMouses(18);

        for (int i = 1; i <= 7; i++) {
            new Thread(() -> {
                for (Mouse mouse : mouseList) {
                    if (mouseList.indexOf(mouse) % 2 != 0) {
                        mouse.peep();
                    }
                }
            }).start();
        }

//        for (int i = 0; i < 7; i++) {
//            mouseList
//                    .stream()
//                    .filter(mouse -> mouse.getNumber() % 2 == 0)
//                    .forEach(mouse -> new Thread(mouse::peep).start());
//        }
    }
}
