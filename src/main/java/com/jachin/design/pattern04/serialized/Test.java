package com.jachin.design.pattern04.serialized;

import com.jachin.design.pattern04.serialized.entity.Address;
import com.jachin.design.pattern04.serialized.entity.Student;

/**
 * @des: 测试类
 * @author: Jachin
 * @date: 2018/8/27 16:45
 */
public class Test {
    public static void main(String[] args) {
        Address address = new Address("广东", "广州", "海珠");
        Student stu = new Student("张三", 25, address);
        Student stu2 = (Student) stu.clone();
        System.out.println(stu.getAddress());
        System.out.println(stu2.getAddress());

    }
}
