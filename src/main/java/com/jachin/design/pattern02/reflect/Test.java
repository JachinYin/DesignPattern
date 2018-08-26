package com.jachin.design.pattern02.reflect;

public class Test {
    public static void main(String[] args) {
        ICar obj = SimpleFactory.create("com.jachin.design.pattern02.reflect.UpCar");
        ICar obj2 = SimpleFactory.create("com.jachin.design.pattern02.reflect.MidCar");
        System.out.println(obj);
        System.out.println(obj2);
    }
}
