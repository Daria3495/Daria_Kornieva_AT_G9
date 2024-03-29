package homework.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountedCharacters {

    public void countCharacters() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            int length = 0;

            while ((line = reader.readLine()) != null) {
                length += line.length();
            }
            System.out.println(length);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        CountedCharacters countedCharacters = new CountedCharacters();
        
        countedCharacters.countCharacters();

    }
}
