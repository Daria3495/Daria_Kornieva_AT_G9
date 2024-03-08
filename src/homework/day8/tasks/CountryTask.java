package homework.day8.tasks;

import homework.day8.tasks.utils.PrintUtil;

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

    public void countObjects() {

        int numberOfCountries = 0;

        for (String country : countriesList) {
            if (country.length() < 7) {
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
        PrintUtil.printListWithForEach(countryTask.countriesList, ", ");
        System.out.println();
        countryTask.countObjects();
        System.out.println();
        countryTask.printNewLine();
    }

}
