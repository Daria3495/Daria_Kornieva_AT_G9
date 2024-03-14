package homework.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//- создать 5 одновременно запускающихся потоков (например, в цикле for),
// в каждом из которых, проитерировать коллекцию из 20 мышей, где каждая пикает
public class Task_1 {

    public static void main(String[] args) {
        List<Mouse> mouseList = new ArrayList<>();
        IntStream.rangeClosed(1, 20)
                .mapToObj(Mouse::new)
                .forEach(mouseList::add);

        for (int i = 0; i < 5; i++) {
            for (Mouse mouse : mouseList) {
                new Thread(mouse::peep).start();
            }
        }
    }

}
