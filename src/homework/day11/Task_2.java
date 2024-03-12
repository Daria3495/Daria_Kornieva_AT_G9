package homework.day11;


//- создать 7 одновременно запускающихся потоков (например, в цикле for),
// в каждом из которых, проитерировать коллекцию из 18 мышей, где каждая четная пикает

import java.util.ArrayList;
import java.util.List;

public class Task_2 {

    public static void main(String[] args) {

        List <Mouse> mouseList = new ArrayList<>();
        for (int mouse = 1; mouse<=18; mouse++){
            mouseList.add(new Mouse(mouse));
        }

        for (int i = 1; i <=7 ; i++) {
            for (int j = 0; j < mouseList.size(); j++) {
                if (j % 2 != 0) {
                    Mouse mouse = mouseList.get(j);
                    new Thread(mouse::peep).start();
                }
            }
        }

//        for (int i = 0; i < 7; i++) {
//            mouseList
//                    .stream()
//                    .filter(mouse -> mouse.getNumber() % 2 == 0)
//                    .forEach(mouse -> new Thread(mouse::peep).start());
//        }
        // тут код - Вопрос к Жене
    }
}
