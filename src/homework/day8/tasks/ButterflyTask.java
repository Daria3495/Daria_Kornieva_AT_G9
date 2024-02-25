package homework.day8.tasks;

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

    public void printWithSpace() {

        for (String butterfly : butterflies) {
            System.out.print(butterfly + " ");
        }
    }

    public void printNewLine() {

        for (String butterfly : butterflies) {
            System.out.println(butterfly);
        }

    }


    public static void main(String[] args) {
        ButterflyTask butterflyTask = new ButterflyTask();
        butterflyTask.addButterflies();
        System.out.println("");
        butterflyTask.countO();
        butterflyTask.printWithSpace();
        System.out.println("");
        butterflyTask.printNewLine();
    }
}
