package com.jachin.design.pattern16.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/2 20:03
 */
public class StudentInfo {
    private int no;
    private String name;
    private int age;
    private IFlyweight fly;

    public StudentInfo(int no, String name, int age, IFlyweight fly) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.fly = fly;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", fly=" + fly +
                '}';
    }
}
