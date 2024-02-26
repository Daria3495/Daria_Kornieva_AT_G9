package homework.day8.tasks.utils;

import homework.day8.my_objects.Bubble;

import java.util.List;

public class PrintUtil {

    public static <T> void printListWithForEach(List<T> list, String separator) {
        for (T element: list) {
            System.out.printf(element + separator);
        }
    }

    public static <T> void printListByIndex(List<T> list, String separator) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + separator);
        }
    }

}
