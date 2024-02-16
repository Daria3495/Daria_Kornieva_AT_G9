package homework.day3.playground.processors;

import homework.day3.playground.essence.craft.Transportable;
import homework.day3.playground.utils.CoordinatesGenerator;

import static java.nio.file.Files.move;

public class TransportableProcessor {

    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        transportable.move(pointA, pointB);
        Class<? extends Transportable> transportableClass = transportable.getClass();
//        transportable.runTransportable(move(pointA, pointB));
        System.out.printf("Transportable %s was moved %s points", transportableClass.getSimpleName(), transportable.move(pointA, pointB)).println();
    }

    public void runTransportable(Transportable transportable) {
        Class<? extends Transportable> transportableClass = transportable.getClass();
        System.out.printf("Transportable %s was moved %s points", transportableClass.getSimpleName(), transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate())).println();
    }
}

