package deep_clone;

import deep_clone.Address;

import java.io.*;

public class Stu implements Serializable {
    public static final long serialVersionUID = 2323l;
    String name;
    String age;
    Address address;

    public Stu() {
    }

    public Stu(String name, String age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Object deepClone() throws Exception{
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutput = new ObjectOutputStream(byteArrayOutputStream);
        objectOutput.writeObject(this);
        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(arrayInputStream);
        return objectInputStream.readObject();
    }

}
