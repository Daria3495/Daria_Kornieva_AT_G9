package homework.day8.tasks.utils;

import homework.day8.my_objects.Bubble;
import homework.day8.my_objects.Sand;

import java.util.List;
import java.util.Map;

public class PrintUtil {

    public static <T> void printListWithForEach(List<T> list, String separator) {
        for (T element : list) {
            System.out.printf(element + separator);
        }
    }

    public static <T> void printListByIndex(List<T> list, String separator) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + separator);
        }
    }

    public static <T, X> void printMapKey(Map<T, X> map, String separator) {
        for (Map.Entry<T, X> entry : map.entrySet()) {
            System.out.print(entry.getKey() + separator);
        }
    }

    public static <T, X> void printMapValue(Map<T, X> map, String separator) {
        for (Map.Entry<T, X> entry : map.entrySet()) {
            System.out.print(entry.getValue() + separator);
        }
    }

    public static <T, X> void printMap(Map<T, X> map) {
        for (Map.Entry<T, X> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}
