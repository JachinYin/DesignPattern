package com.jachin.design.pattern02.simple;

/**
 * 定制简单工厂类
 * author：Jachin
 * date:2018-08-26
 */
public class CarsSimpleFactory {

    public static final String UPTYPE = "upType";
    public static final String MIDTYPE = "midType";
    public static final String DNTYPE = "dnType";

    public static ICar create(String type){
        ICar obj = null;
        switch (type){
            case UPTYPE:
                obj = new UpCar();
                break;
            case MIDTYPE:
                obj = new MidCar();
                break;
            case DNTYPE:
                obj = new DnCar();
                break;
        }
        return obj;
    }
}
