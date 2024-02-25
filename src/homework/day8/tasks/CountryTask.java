package homework.day8.tasks;

import java.util.ArrayList;
import java.util.List;

public class CountryTask {

    List<String> countriesList = new ArrayList<>();

    public void addCountry() {
        countriesList.add("Андора");
        countriesList.add("Португалия");
        countriesList.add("Англия");
        countriesList.add("Замбия");
    }

    public void printObject() {
        for (String i : countriesList) {
            System.out.print(i + ", ");
        }
    }

    public void countObjects() {

        int numberOfCountries = 0;

        for (String i : countriesList) {
            if (i.length() < 7) {
                numberOfCountries++;
            }
        }
        System.out.print("Number of countries with less than 7 letters: " + numberOfCountries);
    }

    public void printNewLine() {
        for (int i = 0; i < countriesList.size(); i++) {
            System.out.println(countriesList.get(i));
        }
    }

    public static void main(String[] args) {
        CountryTask countryTask = new CountryTask();
        countryTask.addCountry();
        countryTask.printObject();
        System.out.println();
        countryTask.countObjects();
        System.out.println();
        countryTask.printNewLine();
    }

}
