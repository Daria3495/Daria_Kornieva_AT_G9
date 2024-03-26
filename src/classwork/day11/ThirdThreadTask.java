package classwork.day11;

import static homework.day11.SleepUtil.sleep;

public class ThirdThreadTask {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 3; i++) {
                    sleep(1000);
                    System.out.printf("t1-%s  ", i);
                }
            }
        }).start();

        Thread.sleep(1000); // заставляет работать t быстрее

        synchronized (lock) {
            for (int i = 0; i < 3; i++) {
                Thread.currentThread().sleep(1000);
                System.out.printf("m-%s  ", i);
            }
        }
    }

}
