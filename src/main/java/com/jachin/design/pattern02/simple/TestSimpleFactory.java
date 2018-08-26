package com.jachin.design.pattern02.simple;

public class TestSimpleFactory {
    public static void main(String[] args) {
        ICar upCar = CarsSimpleFactory.create(CarsSimpleFactory.UPTYPE);
        ICar midCar = CarsSimpleFactory.create(CarsSimpleFactory.MIDTYPE);
        ICar dnCar = CarsSimpleFactory.create(CarsSimpleFactory.DNTYPE);
        System.out.println(upCar);
        System.out.println(midCar);
        System.out.println(dnCar);
    }
}
