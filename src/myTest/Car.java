package myTest;

public class Car {

    int maxSpeed;

    int speed;
    String fuelType;
    byte passengersCount;


    public void startEngine() {
        System.out.println("Engine started");
    }

    public void showSpeed(){
        System.out.println(this.speed);
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
        showSpeed();
        newSpeed = 8;
        speed = 3;
        setSetSpeed(newSpeed);
        showSpeed();

//        System.out.println(newSpeed);
    }

    public void setSetSpeed (int speed) {
        showSpeed();
        speed = speed;
        this.speed = speed;
        showSpeed();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(12);
    }
}
