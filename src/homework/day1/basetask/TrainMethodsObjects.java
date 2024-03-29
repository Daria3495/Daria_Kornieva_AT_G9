package homework.day1.basetask;

import static homework.day1.basetask.Bee.printBeeDetails;
import static homework.day1.basetask.Mouse.printMouseDetails;
import static homework.day1.basetask.Obstacle.printObstacleDetails;
import static homework.day1.basetask.Pineapple.printPineappleDetails;
import static homework.day1.basetask.Souce.printSouceDetails;

public class TrainMethodsObjects {

    public void processMouse(Mouse mouse) {
        System.out.println(mouse.getName() + " " + mouse.getAge());
        printMouseDetails("Mike", 4);
    }

    public void processSouce(Souce souce) {
        System.out.println(souce.getName() + " " + souce.getColor());
        printSouceDetails("Кетчуп", "red");
    }

    public void processBee(Bee bee) {
        System.out.println(bee.getGender() + " " + bee.getWeight());
        printBeeDetails("мальчик", 456);
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println(obstacle.getSeverity() + " " + obstacle.getDescription());
        printObstacleDetails(" картинка не того цвета", "Trivial");
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println(pineapple.getGrade() + " " + pineapple.getHeatCapacity());
        printPineappleDetails("10", 356.87d);
    }


    // не дает использовать метод если он принимает обьект
}
