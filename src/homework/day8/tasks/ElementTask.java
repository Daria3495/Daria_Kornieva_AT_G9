package homework.day8.tasks;

import homework.day8.tasks.utils.PrintUtil;

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
    public void countMoreThanOneWord() {
        int counter = 0;

        for (int i = 0; i < elementsList.size(); i++) {
            if (elementsList.get(i).contains(" ") || elementsList.get(i).contains("-")) {
                counter++;
            }
        }
        System.out.println("Number of names of elements where more than 1 word: " + counter);
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
        PrintUtil.printListWithForEach(elementTask.elementsList, " ");
        System.out.println();
        elementTask.countMoreThanOneWord();
        PrintUtil.printListByIndex(elementTask.elementsList, " ");
        System.out.println();
        elementTask.addObject();
//        elementTask.printViaForEach();
//        System.out.println(); что бы посмотреть вывод раскомментить
        elementTask.removeObject();
//        elementTask.printViaIndex();
//        System.out.println();  что бы посмотреть вывод раскомментить
        elementTask.changeObject();
        PrintUtil.printListWithForEach(elementTask.elementsList, " ");
    }

}
