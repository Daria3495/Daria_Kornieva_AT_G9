package homework.day7;

import java.util.Scanner;

public class ScannerTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String variable = scanner.nextLine();

            if (variable.equalsIgnoreCase("word")) {
                System.out.printf("I've just get %s and I need to stop", variable);
                break;
            }
            System.out.printf("Hello, I just get %s from you\n", variable);
        }

    }

}
