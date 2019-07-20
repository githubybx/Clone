package light_clone;

import light_clone.Stu;

public class Clone_test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("No.23");
        Stu stu = new Stu("张三","12",address);
        Object clone = stu.clone();
        Stu stu1 = (Stu)clone;
        System.out.println(stu1.getAddress().getId() + " " + stu1.getName() + " " + stu1.getAge());
        stu1.getAddress().setId("No.99");
        stu1.setName("李四");
        stu1.setAge("14");
        System.out.println(stu.getAddress().getId() + " " + stu.getName() + " " + stu.getAge());
        System.out.println(stu1.getAddress().getId() + " " + stu1.getName() + " " + stu1.getAge());
    }
}
