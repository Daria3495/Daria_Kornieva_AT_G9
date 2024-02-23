package homework.day7;

import homework.day3.playground.essence.creatures.Fly;

import java.io.*;

public class SerializableTask implements Serializable {

    public void readSerializable() {

        try {
            FileInputStream fis = new FileInputStream("fos.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Fly fly = (Fly) ois.readObject();
            ois.close();

//            FileOutputStream fos = new FileOutputStream("newFile.txt");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);

//            oos.writeObject(fly.toString());
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SerializableTask serializableTask = new SerializableTask();

        serializableTask.readSerializable();
    }

//    public void writeSerializable() {
//
//        try {
//            FileOutputStream fos = new FileOutputStream("newFile.txt");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//            oos.writeObject();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

}
