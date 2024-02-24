package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class CollectionTask {

    public static void main(String[] args) {

        List<String> myArrayList = new ArrayList<>();

        String[] stringArray = "мама мыла раму мыла".split(" ");

        for (String i : stringArray) {
            myArrayList.add(i);
        }

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }
        
        for (String arrayElement: myArrayList) {
            System.out.print(arrayElement + " ");
        }
    }

}
