package classwork.day7;

import java.util.Scanner;

public class SimpleScannerTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.printf("Just got '%s' text\n", incoming);
        }

    }

}
