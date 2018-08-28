package com.jachin.design.pattern04.cloneable.light;

import com.jachin.design.pattern04.cloneable.light.entity.Address;
import com.jachin.design.pattern04.cloneable.light.entity.Student;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("GD","GZ","LTL");
        Student stu1 = new Student("Jachin",18,address);
        Student stu2 = (Student) stu1.clone();

        System.out.println(stu1+"\n"+stu2);
        System.out.println("------------");
        System.out.println(stu1.getAge()+"\t"+stu2.getAge());
        System.out.println(stu1.getName()+"\t"+stu2.getName());
        System.out.println(stu1.getAddress()+"\n"+stu2.getAddress());
    }
}
