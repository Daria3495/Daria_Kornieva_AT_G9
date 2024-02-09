package myTest;

public class Test {

    public int sum(int a, int b) {
        return a + b;
    }

    public void execute() {
        int a = 12;
        int c = 13;
        this.sum(a, c);
        System.out.println(a);
        a = this.sum(a, c);
        a = this.sum(sum(a, c), c);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.execute();
    }
}
