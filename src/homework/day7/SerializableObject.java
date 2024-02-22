package homework.day7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableObject implements Serializable {

    public void writeSerializableObjectInFile () {

        try (FileOutputStream fos = new FileOutputStream("fos.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

    }

}
