package classwork.day11;

import static java.lang.Math.*;


public class ThreadTask {

    public static void heavyMethod() {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000_000; i++) {
            double d = tan(atan(123456789.123456789));
        }
        System.out.printf("I am %s, and I have finished in %s millis \r\n", Thread.currentThread().getName(), (System.currentTimeMillis() - t0));
    }

    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(ThreadTask::heavyMethod);

        Thread t2 = new Thread(ThreadTask::heavyMethod);

        Thread t3 = new Thread(() -> {
//            try {
//                t1.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            heavyMethod();
        });

        // все начинают работать вместе - но 3 - сразу видит что нужно дождаться пока 1й закончит

        t1.start();
        t2.start();
        t3.start();

//        heavyMethod();

//        for (int i = 0; i < 5; i++) {  - выполняется по отдельности - каждый по 2 секунды, общая скорость 10 секунд
//            heavyMethod();
//        }

//        for (int i = 0; i < 5; i++) {
//            new Thread(ThreadTask::heavyMethod).start();
//        }
        // выполняется вместе, каждый бежит больше 2х секунд - но вместе бегут по-этому общая цифра - 2+ секунды для всех 5ти

    }
}
