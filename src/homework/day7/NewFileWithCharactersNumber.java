package homework.day7;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewFileWithCharactersNumber {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));

            String line;
            int lineLength = 0;

            while ((line = reader.readLine()) != null) {
                lineLength += line.length();
            }

            LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
            String fileName = "" + localDateTime + "_" + lineLength;

            BufferedWriter writeNumberOfCharacters = new BufferedWriter(new FileWriter(fileName));

            writeNumberOfCharacters.write(Integer.toString(lineLength));
            writeNumberOfCharacters.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
