package homework.day9;

import homework.day8.my_objects.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Stream;

public class PeopleRunner {

    public static void main(String[] args) {

        Stream<Person> people = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша"));

        double averageAge = people
                .filter(person -> person.getAge() < 60)
                .sorted(Comparator.comparing(Person::getName))
                .map(person -> new Person(person.getAge() + 4, person.getName()))
                .peek(System.out::println)
                .mapToInt(Person::getAge).average().orElse(0);  // почему не работает без orElse

        try (BufferedWriter writeAge = new BufferedWriter(new FileWriter("peopleAverageAge"))) {
            writeAge.write(String.valueOf(averageAge));  // нельзя записать тут просто цифру?
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
