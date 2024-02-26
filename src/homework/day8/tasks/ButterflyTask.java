package homework.day8.tasks;

import homework.day8.tasks.utils.PrintUtil;

import java.util.ArrayList;
import java.util.List;

public class ButterflyTask {

    List<String> butterflies = new ArrayList<>();
    String[] butterfliesArray = "Common blue, Swallowtail, Aglais io, Common blue".split(",");

    public void addButterflies() {

        for (String butterfly : butterfliesArray) {
            butterflies.add(butterfly);
        }

        for (String iterator : butterflies) {
            System.out.printf("\"%s\"", iterator);
        }
    }

    public void countO() {

        int numberOfWordsContainLetter = 0;

        for (int i = 0; i < butterflies.size(); i++) {
            if (butterflies.get(i).contains("o")) {
                numberOfWordsContainLetter += 1;
            }
        }
        System.out.println("Number of objects which contain 'o' is: " + numberOfWordsContainLetter);
    }

    public static void main(String[] args) {
        ButterflyTask butterflyTask = new ButterflyTask();
        butterflyTask.addButterflies();
        System.out.println();
        butterflyTask.countO();
        PrintUtil.printListWithForEach(butterflyTask.butterflies, " ");
        System.out.println();
        PrintUtil.printListWithForEach(butterflyTask.butterflies, "\n");
    }
}
