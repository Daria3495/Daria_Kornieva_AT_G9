package homework.day8.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirdTask {

    List<String> birdsList = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

    public void printObjects() {
        for (String i : birdsList) {
            System.out.println("--" + i + "--");
        }
    }

    public void countVowels() {

        int numberOfBirds = 0;
        for (String bird : birdsList) {
            if (bird.matches(".*[ауоиэы].*[ауоиэы].*")) {
                numberOfBirds++;
            }
        }
        System.out.println("Number of birds with more than 1 vowel: " + numberOfBirds);
    }

    public void printByIndex() {
        for (int i = 0; i < birdsList.size(); i++) {
            System.out.print(birdsList.get(i) + " ");
        }
    }

    public void changeObject() {
        birdsList.set(2, "Синица");
    }

    public void printWithSpace() {
        for (String bird : birdsList) {
            System.out.print(bird + " ");
        }
    }

    public static void main(String[] args) {
        BirdTask birdTask = new BirdTask();

        birdTask.printObjects();
        birdTask.countVowels();
        birdTask.printByIndex();
        System.out.println();
        birdTask.changeObject();
        birdTask.printWithSpace();
    }
}
