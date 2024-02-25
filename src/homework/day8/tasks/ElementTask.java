package homework.day8.tasks;

import javax.naming.ldap.SortResponseControl;
import java.util.ArrayList;
import java.util.List;

public class ElementTask {

    List<String> elementsList = new ArrayList<>();

    public void addElement() {
        elementsList.add("Text field");
        elementsList.add("Radio");
        elementsList.add("Check-box");
        elementsList.add("Drop-down");
        elementsList.add("Picker");
        elementsList.add("Breadcrumb");
    }

    public void printViaForEach() {
        for (String element : elementsList) {
            System.out.print(element + " ");
        }
    }

    public void countMoreThanOneWord() {
        int counter = 0;

        for (int i = 0; i < elementsList.size(); i++) {
            if (elementsList.get(i).contains(" ") || elementsList.get(i).contains("-")) {
                counter++;
            }
        }
        System.out.println("Number of names of elements where more than 1 word: " + counter);
    }

    public void printViaIndex() {

        for (int i = 0; i < elementsList.size(); i++) {
            System.out.print(elementsList.get(i) + " ");
        }

    }

    public void addObject() {
        elementsList.add(3, "Spinner");
    }

    public void removeObject() {
        elementsList.remove(1);
    }

    public void changeObject() {
        elementsList.set(4, "Switch");
    }

    public static void main(String[] args) {
        ElementTask elementTask = new ElementTask();
        elementTask.addElement();
        elementTask.printViaForEach();
        System.out.println();
        elementTask.countMoreThanOneWord();
        elementTask.printViaIndex();
        System.out.println();
        elementTask.addObject();
//        elementTask.printViaForEach();
//        System.out.println(); что бы посмотреть вывод раскомментить
        elementTask.removeObject();
//        elementTask.printViaIndex();
//        System.out.println();  что бы посмотреть вывод раскомментить
        elementTask.changeObject();
        elementTask.printViaForEach();
    }

}
