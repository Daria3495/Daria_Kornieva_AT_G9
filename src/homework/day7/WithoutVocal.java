package homework.day7;

import java.io.*;

public class WithoutVocal {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader reader;

        reader = new BufferedReader(new FileReader("file.txt"));
        String line;

        if (!((line = reader.readLine()) != null)) {
            return;
        }
        reader.close();

        String newLine = line.replaceAll("[aeiouAEIOU]", "");

        BufferedWriter writeWithoutVocal = new BufferedWriter(new FileWriter("file.txt"));

        writeWithoutVocal.write(newLine);
        System.out.println("Text is updated and now is stored without vocal");
        writeWithoutVocal.close();
    }

}
