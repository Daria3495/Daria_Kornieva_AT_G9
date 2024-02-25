package homework.day8.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityTask {

    String[] citiesArray = {"Минск", "Москва", "Берлин"};
    List<String> citiesList = new ArrayList<>(Arrays.asList(citiesArray));

    public void printNewLine() {

        for (String city : citiesList) {
            System.out.println(city);
        }
    }

    public void countAllLetters() {

        int numberOfLetters = 0;

        for (int i = 0; i < citiesList.size(); i++) {
            numberOfLetters += citiesList.get(i).length();
        }
        System.out.println("Number of letters in all words: " + numberOfLetters);
    }

    public void printWithSpace() {

        for (int i = 0; i < citiesList.size(); i++) {
            System.out.print(citiesList.get(i) + " ");
        }
    }


    public static void main(String[] args) {
        CityTask cityTask = new CityTask();

        cityTask.printNewLine();
        cityTask.countAllLetters();
        cityTask.printWithSpace();
    }

}
