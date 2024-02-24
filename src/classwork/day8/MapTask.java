package classwork.day8;

import java.util.HashMap;
import java.util.Map;

public class MapTask {

    public static void main(String[] args) {

        Map<Integer, String> wordsMap = new HashMap<>();

        String[] myString = "мама мыла раму мыла".split(" ");

        for (int i = 0; i < myString.length; i++) {
            wordsMap.put(i, myString[i]);
        }

        for (int key : wordsMap.keySet()) { // можно распоковать Integer в примитив
            System.out.println(key);
        }

        for (String value : wordsMap.values()) {
            System.out.println(value);
        }
    }

}
