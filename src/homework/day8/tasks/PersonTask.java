package homework.day8.tasks;

import homework.day8.my_objects.Bubble;
import homework.day8.my_objects.Person;
import homework.day8.tasks.utils.PrintUtil;

import java.util.ArrayList;
import java.util.List;

public class PersonTask {

    List<Person> personList = new ArrayList<>();

    public void addPersonToList() {
        personList.add(new Person(32,"Коля"));
        personList.add(new Person(24,"Оля"));
        personList.add(new Person(55,"Вася"));
        personList.add(new Person(63,"Маша"));
    }

    public void printAge() {
        for (Person person : personList) {
            System.out.print(person.getAge()+ " ");
        }
    }

    public void printName() {
        for (Person person : personList) {
            System.out.print(person.getName()+ " ");
        }
    }

    public static void main(String[] args) {
        PersonTask personTask = new PersonTask();

        personTask.addPersonToList();
        personTask.printAge();
        System.out.println();
        personTask.printName();
        System.out.println();
        PrintUtil.printListByIndex(personTask.personList, "\n");
    }

}
