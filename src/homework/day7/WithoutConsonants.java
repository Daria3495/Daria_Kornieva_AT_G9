package homework.day7;

import java.io.*;

public class WithoutConsonants {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));

        String line;

        if (!((line = reader.readLine()) != null)) {
            return;
        }
        reader.close();

        BufferedWriter writeWithoutConsonants = new BufferedWriter(new FileWriter("file.txt", true));

        String updatedText = line.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
        writeWithoutConsonants.newLine();
        writeWithoutConsonants.newLine();
        writeWithoutConsonants.write(updatedText);
        writeWithoutConsonants.close();
    }

}
