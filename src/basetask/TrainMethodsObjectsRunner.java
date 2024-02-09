package basetask;

public class TrainMethodsObjectsRunner {

    public static void main(String[] args) {

        TrainMethodsObjects newObject = new TrainMethodsObjects();

        Mouse mouse = new Mouse("Sue", 2);
        Souce souce = new Souce("Бешамель", "white");
        Bee bee = new Bee("девочка", 756);
        Obstacle obstacle = new Obstacle("Крэшььь", "Blocker");

        Pineapple pineapple = new Pineapple("5", 45.65d);

        newObject.processMouse(mouse);
        newObject.processSouce(souce);
        newObject.processBee(bee);
        newObject.processObstacle(obstacle);
        newObject.processPineapple(new Pineapple("", 62.324));
    }

}
