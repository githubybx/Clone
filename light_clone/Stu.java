package light_clone;

public class Stu implements Cloneable {
    String name;
    String age;
    Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

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

}
