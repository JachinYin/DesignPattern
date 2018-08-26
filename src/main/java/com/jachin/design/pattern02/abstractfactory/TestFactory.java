package com.jachin.design.pattern02.abstractfactory;

public class TestFactory {
    public static void main(String[] args) {
        AbstractFactory upFactory = new UpFactory();
        AbstractFactory midFactory = new MidFactory();
        AbstractFactory dnFactory = new DnFactory();
        System.out.println(upFactory.createCar());
        System.out.println(upFactory.createCar());
    }
}
