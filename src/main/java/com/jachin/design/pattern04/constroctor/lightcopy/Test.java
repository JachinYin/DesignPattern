package com.jachin.design.pattern04.constroctor.lightcopy;

import com.jachin.design.pattern04.entity.Address;

public class Test {
    public static void main(String[] args) {
        Address address = new Address("GD","GZ","LTL");
        Student stu1 = new Student("Jachin",18,address);
        Student stu2 = new Student(stu1);

        System.out.println(stu1+"\n"+stu2);
        System.out.println("通过以上两个地址可知对象通过复制得到了新对象");
        System.out.println("------------");
        System.out.println(stu1.getAge()+"\t"+stu2.getAge());
        System.out.println(stu1.getName()+"\t"+stu2.getName());
        System.out.println(stu1.getAddress()+"\n"+stu2.getAddress());
        System.out.println("通过以上三者比较，看到姓名和年龄都直接复制了，而地址却是引用的同一处");
    }
}
