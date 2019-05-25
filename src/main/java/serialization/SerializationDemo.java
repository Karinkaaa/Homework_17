package serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /* Придумать любую класс-сущность и наполнить ее тестовыми свойствами,
         * сохранить ее в файл используя Serializable,
         * считать из файла,
         * сохранить в файл используя Externalizable,
         * считать из файла. */

        User user = new User("Roma", "Isaev", 25);
        FileOutputStream fos = new FileOutputStream("object.json");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // запись объекта в файл
        oos.writeObject(user);


        FileInputStream fis = new FileInputStream("object.json");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // считывание объекта из файла
        User restore = (User) ois.readObject();
        System.out.println(restore);


    }
}
