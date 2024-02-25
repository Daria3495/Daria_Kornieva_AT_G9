package homework.day8.tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarTask {

    List<String> carsList = new ArrayList<>(List.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди"));

    public void writeToFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("cars"))) {
            for (String car : carsList) {
                bufferedWriter.write("\"" + car + "\"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void removeObject() {

        List<String> newCarList = new ArrayList<>();

        for (int i = 0; i < carsList.size(); i++) {
            if (carsList.get(i).length() <= 4) {
                newCarList.add(carsList.get(i));
            }
        }
        System.out.println(newCarList);
    }

    public void removeObjectUsingIterator() {

        Iterator<String> iterator = carsList.iterator();

        while (iterator.hasNext()) {
            String car = iterator.next();
            if (car.length() > 4) {
                iterator.remove();
            }
        }
    }

    public void printListWithSpace () {
        for (String car : carsList) {
            System.out.print(car + " ");
        }
    }

    public static void main(String[] args) {

        CarTask carTask = new CarTask();

        carTask.writeToFile();
        carTask.removeObject();
        carTask.removeObjectUsingIterator();
        carTask.printListWithSpace();
    }
}
