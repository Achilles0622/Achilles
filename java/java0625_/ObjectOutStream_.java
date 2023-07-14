package java0625_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutStream_ {
    public static void main(String[] args) throws Exception{
        String filePath="e:\\data.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.write('a');
        oos.writeDouble(9.5);
        oos.writeUTF("hsp");
        oos.writeObject(new Dog("旺财",10));
        oos.close();
        System.out.println("over^^^^^^^^");
    }
}
class Dog{
    private String name;private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
