package cycletask;

public class CycleFor {

    public static void runForCycle() {

        for (int i = 3; i <= 19; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                i++;
            }
        }
    }

}
