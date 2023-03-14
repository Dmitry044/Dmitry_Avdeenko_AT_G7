package classwork.day6.reader;

import java.io.*;
import java.util.Date;

public class Serilization {



    public static void write() throws IOException {
        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //oos.writeInt(7895);
        oos.writeObject(new Person("I am String object", 33, 180,90));
        //oos.writeObject(new Date());
        oos.close();
    }

    public static void read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person = (Person) ois.readObject();
        ois.close();
        System.out.println(person);

        /*int i = ois.readInt();
        String today = (String) ois.readObject(); //явное приведение типов
        Date date = (Date) ois.readObject();
        ois.close();*/
    }


    private static class Person {
        public Person(String iAmStringObject, int i, int i1, int i2) {
        }
    }
}

