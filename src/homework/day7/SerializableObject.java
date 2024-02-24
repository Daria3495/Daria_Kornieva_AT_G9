package homework.day7;

import homework.day3.playground.essence.creatures.Fly;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableObject implements Serializable {

    public void writeSerializableObjectInFile () {


        try (FileOutputStream fos = new FileOutputStream("fos.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Fly fly = new Fly(4, "Victor");
            oos.writeObject(fly);
            System.out.printf("Обьект %s успешно записан в файл", fly);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        SerializableObject serializableObject = new SerializableObject();
        serializableObject.writeSerializableObjectInFile();

    }

}
