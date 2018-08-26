package com.jachin.design.pattern02.factory;

public class TestFactory {
    public static void main(String[] args) {
        AbstractFactory upFactory = new UpFactory();
        AbstractFactory midFactory = new MidFactory();
        AbstractFactory dnFactory = new DnFactory();
        System.out.println(upFactory.create());
        System.out.println(upFactory.create());
    }
}
