package homework.day7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class WriteScannerTask {

    public void createScannerFile() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String result = "Hello, I just get " + input + " from you!";

        try {
            BufferedWriter oos = new BufferedWriter(new FileWriter("file.txt"));
            oos.write(result);
            System.out.println("Text is added to the file");
            oos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        WriteScannerTask writeScannerTask = new WriteScannerTask();
        writeScannerTask.createScannerFile();

    }
}
