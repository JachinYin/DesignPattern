package com.jachin.design.pattern04.cloneable.light.entity;

public class Student implements Cloneable{
    private String name;
    private int age;
    Address address;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Address getAddress() {
        return address;
    }
}
