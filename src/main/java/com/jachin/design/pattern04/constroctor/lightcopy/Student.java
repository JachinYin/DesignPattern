package com.jachin.design.pattern04.constroctor.lightcopy;

import com.jachin.design.pattern04.entity.Address;

public class Student {
    private String name;
    private int age;
    Address address;

    public Student(Student s){
        name = s.getName();
        age = s.getAge();
        address = s.getAddress();
    }

    public Student(String name, int age, Address address) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
