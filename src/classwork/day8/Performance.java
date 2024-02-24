package classwork.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Performance {

    public static void main(String[] args) {

        long l0 = System.currentTimeMillis();
        List<String> myArrayList = new ArrayList<>();
        int length = 10000000;

        for (int i = 0; i <= length; i++) {
            myArrayList.add(i,"Some text here " + i);
        }

        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l0);

        long l2 = System.currentTimeMillis();

        List<String> myLinkedList = new LinkedList<>();

        for (int i = 0; i <= length; i++) {
            myLinkedList.add(i,"Some text here " + i);
        }
        long l3 = System.currentTimeMillis();
        System.out.println(l3 - l2);

    }

}
