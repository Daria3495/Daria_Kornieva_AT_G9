package homework.day8.tasks;

import homework.day8.tasks.utils.PrintUtil;

import java.util.ArrayList;
import java.util.List;

public class NoodlesTask {

    List <String> noodlesList = new ArrayList<>();

    public void addObjects() {
        noodlesList.add("Hakka");
        noodlesList.add("Ramen");
        noodlesList.add("Hibachi");
        noodlesList.add("Schezwan");
    }

    public void changeLetter() {

        String newNoodle;

        for (int i =0; i < noodlesList.size(); i++) {
            if (noodlesList.get(i).contains("a")) {
                newNoodle = noodlesList.get(i).replace('a', 'o');
                noodlesList.set(i,newNoodle);
            }
        }
    }

    public static void main(String[] args) {
        NoodlesTask noodlesTask = new NoodlesTask();

        noodlesTask.addObjects();
        PrintUtil.printListWithForEach(noodlesTask.noodlesList, " - ");
        System.out.println();
        noodlesTask.changeLetter();
        System.out.println("Updated list when a letter in noodle is changed to o:");
        PrintUtil.printListByIndex(noodlesTask.noodlesList);
    }

}
