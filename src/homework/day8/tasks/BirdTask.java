package homework.day8.tasks;

import homework.day8.tasks.utils.PrintUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirdTask {

    public final String VOWELS = "ауоиэыяюеёАУОИЭЫЯЮЕЁ";

    List<String> birdsList = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

    public void printObjects() {
        for (String i : birdsList) {
            System.out.println("--" + i + "--");
        }
    }

    public void countVowels() {

        int numberOfBirds = 0;
        for (String bird : birdsList) {
            if (bird.matches(".*[VOWELS].*[VOWELS].*")) {
                numberOfBirds++;
            }
        }
        System.out.println("Number of birds with more than 1 vowel: " + numberOfBirds);
    }

    public void changeObject() {
        birdsList.set(2, "Синица");
    }

    public static void main(String[] args) {
        BirdTask birdTask = new BirdTask();

        birdTask.printObjects();
        birdTask.countVowels();
        PrintUtil.printListByIndex(birdTask.birdsList, " ");
        System.out.println();
        birdTask.changeObject();
        PrintUtil.printListWithForEach(birdTask.birdsList, " ");
    }
}
