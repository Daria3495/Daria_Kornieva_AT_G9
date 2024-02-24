package classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTask {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();

        String[] myString = "мама мыла раму мыла".split(" ");

        for (String i : myString) {
            mySet.add(i);
        }

        for (String arrayElement : mySet) {
            System.out.print(arrayElement + " ");
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

}
