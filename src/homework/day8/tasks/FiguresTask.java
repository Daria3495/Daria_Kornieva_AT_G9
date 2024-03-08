package homework.day8.tasks;

import homework.day8.tasks.utils.PrintUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiguresTask {

    String[] figuresArray = {"Oval", "Rectangle", "Circle", "Square", "Ellipse"};
    List<String> figuresList = new ArrayList<>(Arrays.asList(figuresArray));

    public void writeToFile() {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("figures"))) {
            for (String i : figuresList) {
                bufferedWriter.write(i + " - ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void countFiguresWithoutLetter() {

        int numberOfWordsWithoutLetter = 0;

        for (int i = 0; i < figuresList.size(); i++) {
            if (!figuresList.get(i).contains("i")) {
                numberOfWordsWithoutLetter++;
            }
        }
        System.out.println("Number of words without i: "+numberOfWordsWithoutLetter);

    }

    public void addNewFigure() {
        figuresList.add(2, "Triangle");
    }


    public static void main(String[] args) {
        FiguresTask figuresTask = new FiguresTask();

        figuresTask.writeToFile();
        figuresTask.countFiguresWithoutLetter();
        PrintUtil.printListWithForEach(figuresTask.figuresList, " ");
        System.out.println();
        figuresTask.addNewFigure();
        PrintUtil.printListWithForEach(figuresTask.figuresList, " ");
    }
}
