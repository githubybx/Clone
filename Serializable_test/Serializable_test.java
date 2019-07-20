package Serializable_test;

import deep_clone.Address;
import deep_clone.Stu;

import java.io.*;
import java.time.LocalDate;

public class Serializable_test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address("23");
        Stu stu = new Stu("李四","23",address);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\Stu.obj"));
        outputStream.writeObject(stu);
        LocalDate now = LocalDate.now();
        outputStream.writeObject(now);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\Stu.obj"));
        Stu stu1 = (Stu) objectInputStream.readObject();
        LocalDate localDate = (LocalDate) (objectInputStream.readObject());
        System.out.println(stu1.getAddress().getId() + " " + stu1.getAge() + " " + stu1.getName());
        System.out.println(localDate.toString());
    }
}
