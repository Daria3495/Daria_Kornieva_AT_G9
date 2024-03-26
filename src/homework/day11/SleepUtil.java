package homework.day11;

public class SleepUtil {
    public static void sleep(int millisecondsNumber) {
        try {
            Thread.sleep(millisecondsNumber);
            System.out.println("Display milliseconds "+millisecondsNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
