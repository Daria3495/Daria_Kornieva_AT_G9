package myTest;

import myTest.Human;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Human human;
        human = new Human();
        System.out.println(human.age);

        human.age = 12;

        System.out.println(human.age);

        Human person = new Human();
        person.name = "Nick";
        person.age = 20;
        person.sex = true;



        // myTest.Car
//        myTest.Car car = new myTest.Car();
//        int speed = 12;
//        car.maxSpeed = 13;
//        car.startEngine();
//        car.setSpeed(15);
//        car.setSpeed(speed);

    }
}