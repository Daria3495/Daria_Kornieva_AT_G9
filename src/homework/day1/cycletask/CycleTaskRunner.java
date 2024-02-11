package homework.day1.cycletask;

public class CycleTaskRunner {

    static CycleWhile whileRunner = new CycleWhile();

    static CycleFor forRunner = new CycleFor();

    static RandomArray randomRunner = new RandomArray();

    public static void main(String[] args) {

        whileRunner.runWhile();
        System.out.println(" ");
        forRunner.runForCycle();
        System.out.println(" ");
        System.out.println("Random values are: ");
        randomRunner.assignRandom();
        System.out.println("\n" +"Random values in reverse order are: ");
        randomRunner.assignReverse();
        System.out.println("\n" +"Random values multiplied on 5: ");
        randomRunner.multiplyArray();
        System.out.println("\n" +"Random values squaring: ");
        randomRunner.squaring();
        System.out.println("\n" +"Minimum value through random is ");
        randomRunner.findMinValue();
        System.out.println("\n" +"Change value first = last and last = first ");
        randomRunner.changePlace();
        System.out.println("\n" +"Array sorted in descending order ");
        randomRunner.descSorting();
    }

}
